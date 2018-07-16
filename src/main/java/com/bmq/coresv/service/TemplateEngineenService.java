package com.bmq.coresv.service;

import java.io.IOException;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public interface TemplateEngineenService {

	public String getContent(String templateName,Map<String, Object> inputParam) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException;
}
