package com.bmq.coresv.repository;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bmq.coresv.BmqCoresvApplication;
import com.bmq.coresv.model.BmqCustomer;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BmqCoresvApplication.class)
@AutoConfigureMockMvc
// @ActiveProfiles(profiles = TestConfiguration.TEST_PROFILE)
// @Transactional
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void testInsert() {

		BmqCustomer cus = new BmqCustomer();
		cus.setAddressId(1L);
		cus.setCreatedBy("phuhns");
		cus.setCustomerId(-2L);
		cus.setCustomerName("Nguyen Van A");
		cus.setEmail("kimlongap@gmail.com");
		cus.setPhone("01698675420");
		cus.setUpdatedBy("phuhns");
		customerRepository.save(cus);
		assertEquals(2, customerRepository.count());
	}
	@Test
	public void testFindByEmail() {
		
		BmqCustomer customer = customerRepository.findByEmail("phu.hns@bmq.vn");
		assertNotNull(customer);
	}
}
