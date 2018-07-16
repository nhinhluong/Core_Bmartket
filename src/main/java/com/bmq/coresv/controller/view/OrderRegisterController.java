package com.bmq.coresv.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/order")
public class OrderRegisterController {

	@GetMapping("/register")
	public String orderRegisterView() {
		return "/order/register";
	}
}
