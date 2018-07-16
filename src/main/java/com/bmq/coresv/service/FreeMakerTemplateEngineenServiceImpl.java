package com.bmq.coresv.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Service
public class FreeMakerTemplateEngineenServiceImpl implements TemplateEngineenService {

	@Autowired
	private Configuration freemarkerConfig;

	@Override
	public String getContent(String templateName, Map<String, Object> inputParam) throws TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException {
		// TODO Auto-generated method stub

		Template t = freemarkerConfig.getTemplate(templateName+".ftl");
		String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, inputParam);
		return text;
	}

}
