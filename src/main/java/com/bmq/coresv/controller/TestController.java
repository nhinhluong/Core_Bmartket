package com.bmq.coresv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/api/home/test")
	public String home() {
		System.out.println("***********************************");
		return "welcome";
	}
}
