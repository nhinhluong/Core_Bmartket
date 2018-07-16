package com.bmq.coresv.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bmq.coresv.controller.form.dto.OrderDTO;
import com.bmq.coresv.dto.MailDTO;
import com.bmq.coresv.dto.MailTemplateDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class OrderServiceImpl {

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Autowired
	ObjectMapper jsonMapper;

	@Autowired
	MailService mailService;

	@Value("${email.order.notify}")
	public String bmqEmails;

	@SuppressWarnings("unchecked")
	public void processOrder(OrderDTO order) throws TemplateNotFoundException, IOException, TemplateException {

		// String objStr = jsonMapper.writeValueAsString(order);
		order.setOrderCode(generateOrderCode(order.getProductCode()));
		Map<String, Object> map = jsonMapper.convertValue(order, Map.class);
		String email = order.getEmail();
		// send email to user
		sendToUser(email, map);
		// send email to bmq
		sendEmailToBMQ(email, map);
	}

	private String generateOrderCode(String productCode) {
		String result = productCode;
		SimpleDateFormat fm = new SimpleDateFormat("yyyymmddSSS");
		result += "-" + fm.format(new Date());
		return result;
	}

	private void sendEmailToBMQ(String email, Map<String, Object> data)
			throws TemplateNotFoundException, IOException, TemplateException {
		MailDTO mail = new MailDTO();
		mail.setTo(bmqEmails.split(";"));
		// mail.set
		MailTemplateDTO template = new MailTemplateDTO();
		template.setSubjectTemplate("mail/order-contact/send-to-bmq-subject");
		template.setSubjectParams(data);
		// set body
		template.setBodyParams(data);
		template.setBodyTemplate("mail/order-contact/send-to-bmq-body");
		mailService.sendEmailWithBodyTemplate(mail, template);
	}

	private void sendToUser(String email, Map<String, Object> data)
			throws TemplateNotFoundException, IOException, TemplateException {
		MailDTO mail = new MailDTO();
		mail.setTo(new String[] { email });
		// mail.set
		MailTemplateDTO template = new MailTemplateDTO();
		template.setSubjectTemplate("mail/order-contact/reply-customer-when-finish-subject");
		template.setSubjectParams(data);
		// set body
		template.setBodyParams(data);
		template.setBodyTemplate("mail/order-contact/reply-customer-when-finish-body");
		mailService.sendEmailWithBodyTemplate(mail, template);
	}
}
