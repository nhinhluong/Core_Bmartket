package com.bmq.coresv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@ImportResource("classpath:webflow-config.xml")
public class BmqCoresvApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BmqCoresvApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BmqCoresvApplication.class, args);
	}
}
