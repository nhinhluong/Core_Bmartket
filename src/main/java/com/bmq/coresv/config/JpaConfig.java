package com.bmq.coresv.config;

import java.util.Arrays;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Quan Hoang JPA configuraion for Agent service
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.bmq.coresv.repository")
@EnableTransactionManagement
public class JpaConfig {

	@Autowired
	private Environment env;

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@Profile("dev") // Only turn on H2 console in dev mode
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/h2console/*");
		return registrationBean;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		Properties properties = new Properties();

		vendorAdapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		vendorAdapter.setGenerateDdl(true);
//		
//		if (Arrays.asList(env.getActiveProfiles()).contains("dev")) {
//			vendorAdapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
//			properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//			vendorAdapter.setGenerateDdl(true);
//		} else if (Arrays.asList(env.getActiveProfiles()).contains("devtest")
//				|| Arrays.asList(env.getActiveProfiles()).contains("dev_oracle")) {
//			vendorAdapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
//			properties.setProperty("hibernate.hbm2ddl.auto", "none");
//			vendorAdapter.setGenerateDdl(false);
//		} else if (Arrays.asList(env.getActiveProfiles()).contains("uat")) {
//			vendorAdapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
//			properties.setProperty("hibernate.hbm2ddl.auto", "none");
//			vendorAdapter.setGenerateDdl(false);
//		}

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		factory.setPackagesToScan("com.bmq.coresv.model");

		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setDataSource(dataSource());
		factory.afterPropertiesSet();
		factory.setJpaProperties(properties);

		return factory.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}

}
