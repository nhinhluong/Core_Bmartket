package com.bmq.coresv.dto;

import java.util.Map;

public class MailTemplateDTO {

	private String subjectTemplate;
	private String bodyTemplate;
	private Map<String, Object> subjectParams;
	private Map<String, Object> bodyParams;
	public String getSubjectTemplate() {
		return subjectTemplate;
	}
	public void setSubjectTemplate(String subjectTemplate) {
		this.subjectTemplate = subjectTemplate;
	}
	public String getBodyTemplate() {
		return bodyTemplate;
	}
	public void setBodyTemplate(String bodyTemplate) {
		this.bodyTemplate = bodyTemplate;
	}
	public Map<String, Object> getSubjectParams() {
		return subjectParams;
	}
	public void setSubjectParams(Map<String, Object> subjectParams) {
		this.subjectParams = subjectParams;
	}
	public Map<String, Object> getBodyParams() {
		return bodyParams;
	}
	public void setBodyParams(Map<String, Object> bodyParams) {
		this.bodyParams = bodyParams;
	}
	
	
	
}
