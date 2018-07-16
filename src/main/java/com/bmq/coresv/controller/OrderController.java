package com.bmq.coresv.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bmq.coresv.controller.form.dto.OrderDTO;
import com.bmq.coresv.model.BmqCustomer;
import com.bmq.coresv.repository.CustomerRepository;
import com.bmq.coresv.service.OrderServiceImpl;

import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
@RequestMapping("/process/order")
public class OrderController {

	@Autowired
	CustomerRepository customerRepository;

	@RequestMapping("/step1")
	public String step1(Model model, HttpServletRequest request, @RequestParam("user") String userEmail,
			@RequestParam("productName") String productName, @RequestParam("productCode") String productCode) {

		OrderDTO dto = new OrderDTO();
		BmqCustomer customer = customerRepository.findByEmail(userEmail);
		if (customer != null) {
			dto.setCustomerName(customer.getCustomerName());
			dto.setPhone(customer.getPhone());
			dto.setEmail(customer.getEmail());
		}
		dto.setProductCode(productCode);
		dto.setProductName(productName);

		model.addAttribute("order", dto);

		return "/order/step1";
	}

	@RequestMapping("/step2")
	public String step2(@Valid @ModelAttribute("order") OrderDTO order, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		System.out.println(order.toString());
		return "/order/step2";
	}

	@RequestMapping(value = "/processStep2", params = "backToStep1", method = RequestMethod.POST)
	public String backToStep1(@Valid @ModelAttribute("order") OrderDTO order) {
		return "/order/step1";
	}

	@Autowired
	OrderServiceImpl orderService;

	@RequestMapping(value = "/processStep2", params = "step3", method = RequestMethod.POST)
	public String step3(@Valid @ModelAttribute("order") OrderDTO order)
			throws TemplateNotFoundException, IOException, TemplateException {

		orderService.processOrder(order);
		return "/order/step3";
	}

}
