package com.bmq.coresv.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bmq.coresv.model.BmqCustomer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<BmqCustomer, Long> {

	@RestResource(path = "byAgent")
	BmqCustomer findByEmail(@Param("email") String email);
}
