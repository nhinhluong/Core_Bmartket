package com.bmq.coresv.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.bmq.coresv.dto.MailDTO;
import com.bmq.coresv.dto.MailTemplateDTO;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MailServiceTest {

	@Autowired
	MailService mailService;

	@Test
	public void testInit() {
		// mailService.sendEmail(null, null);
		MailDTO mailDTO = new MailDTO();
		mailDTO.setSubject("Xin chao test");
		mailDTO.setText("Noi dung text o day");
		mailDTO.setTo(new String[] { "phu.hns@bmq.vn" });
		mailService.sendEmail(mailDTO);
	}

	@Test
	public void testSendWithTemplate() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		// mailService.sendEmail(null, null);
		MailDTO mailDTO = new MailDTO();
		mailDTO.setSubject("Xin chao test");
		mailDTO.setText("Noi dung text o day");
		mailDTO.setTo(new String[] { "phu.hns@bmq.vn"  });
		MailTemplateDTO template = new MailTemplateDTO();
		//template.setSubjectTemplate("mail/email-order-template");
		Map<String, Object> subjectTemplate = new HashMap<>();
		subjectTemplate.put("fullName", "Nguyen Van A");
		template.setSubjectParams(subjectTemplate);
		template.setBodyParams(subjectTemplate);
		template.setBodyTemplate("mail/email-template");
		mailService.sendEmailWithBodyTemplate(mailDTO, template);
	}
}
