package com.bmq.coresv.service;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateEngineeTest {

	@Autowired
	TemplateEngineenService templateService;

	@Test
	public void testInit() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {
		// mailService.sendEmail(null, null);
		String result = templateService.getContent("mail/email-template", new HashMap<>());
		Assert.assertNotNull(result);
		System.out.println(result);
	}

	@Test
	public void testGetTemplateOrder() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {
		// mailService.sendEmail(null, null);
		HashMap<String, Object> params = new HashMap<>();
		params.put("fullName", "Nguyen Van A");

		String result = templateService.getContent("mail/email-order-template", params);
		Assert.assertNotNull(result);
		System.out.println(result);
	}

}
