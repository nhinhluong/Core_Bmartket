package com.bmq.coresv.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmq.coresv.model.BmqCustomer;
import com.bmq.coresv.repository.CustomerRepository;

@Controller
@RequestMapping("/api/home")
public class HomeController {

	@Autowired
	CustomerRepository customerRepos;
	@GetMapping("/")
	public String home(Map<String, Object> model) {
		BmqCustomer cus = new BmqCustomer();
		cus.setAddressId(2L);
		cus.setCreatedBy("phuhns");
		cus.setCustomerId(1L);
		cus.setCustomerName("Nguyen Van A");
		cus.setEmail("kimlongap@gmail.com");
		cus.setPhone("01698675420");
		cus.setUpdatedBy("phuhns");
		customerRepos.save(cus);
		return "welcome";
	}

}
