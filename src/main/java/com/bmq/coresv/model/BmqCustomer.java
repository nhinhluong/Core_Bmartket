package com.bmq.coresv.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BMDT_CUSTOMER")
public class BmqCustomer extends AbstractEntity implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "CUSTOMER_ID", unique = true)
	@Id
	@SequenceGenerator(name = "CustomerIDSeq", sequenceName = "SEQ_CUST_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CustomerIDSeq")
	private Long customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "EMAIL", unique = true)
	private String email;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "REF_ADDR_ID")
	private Long addressId;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

}
