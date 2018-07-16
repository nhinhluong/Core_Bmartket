package com.bmq.coresv.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.bmq.coresv.dto.MailDTO;
import com.bmq.coresv.dto.MailTemplateDTO;
import com.bmq.coresv.util.MessageConstant;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class MailService {

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	TemplateEngineenService templateEngineen;

	@Value("${spring.mail.username}")
	public String senderEmail;

	public void sendEmail(MailDTO mailDTO) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(senderEmail);
		message.setTo(mailDTO.getTo());
		message.setSubject(mailDTO.getSubject());
		message.setText(mailDTO.getText());
		mailSender.send(message);

	}

	public void sendEmailWithBodyTemplate(MailDTO mailDTO, MailTemplateDTO templateParam)
			throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException,
			TemplateException {
		if (templateParam == null) {
			throw new IllegalArgumentException(MessageConstant.TEMPLATE_CONFIG_ERROR);
		}
		MimeMessagePreparator messagePreparator = mimeMessage -> {
			MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
			message.setFrom(senderEmail);
			message.setTo(mailDTO.getTo());
			if (templateParam.getSubjectTemplate() == null) {
				message.setSubject(mailDTO.getSubject());
			} else {
				String subjectTemplate = templateEngineen.getContent(templateParam.getSubjectTemplate(),
						templateParam.getSubjectParams());
				message.setSubject(subjectTemplate);
			}
			if (templateParam.getBodyTemplate() == null) {
				message.setText(mailDTO.getText(), true);
			} else {
				String body = templateEngineen.getContent(templateParam.getBodyTemplate(),
						templateParam.getBodyParams());
				message.setText(body, true);
			}
		};

		mailSender.send(messagePreparator);

	}
}
