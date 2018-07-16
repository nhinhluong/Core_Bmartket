package com.bmq.coresv.controller.form.dto;

import java.util.Arrays;

public class OrderDTO {

	private String customerName;
	private String email;
	private String productName;
	private Integer productQuantity;
	private String phone;
	private String requirementNote;
	private String delivery;
	private String paymentMode;
	private String[] purpose;
	private String[] frequently;
	private String[] preferSuppliers;
	private String productCode;
	private String orderCode;

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public String getRequirementNote() {
		return requirementNote;
	}

	public void setRequirementNote(String requirementNote) {
		this.requirementNote = requirementNote;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPurpose(String[] purpose) {
		this.purpose = purpose;
	}

	public String[] getPurpose() {
		return purpose;
	}

	public void setFrequently(String[] frequently) {
		this.frequently = frequently;
	}

	public String[] getFrequently() {
		return frequently;
	}

	public String[] getPreferSuppliers() {
		return preferSuppliers;
	}

	public void setPreferSuppliers(String[] preferSuppliers) {
		this.preferSuppliers = preferSuppliers;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public OrderDTO(String customerName, String email, String productName, Integer productQuantity, String fullName,
			String phone, String requirementNote, String delivery, String paymentMode, String purpose,
			String[] frequently, String[] preferSuppliers) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.phone = phone;
		this.requirementNote = requirementNote;
		this.delivery = delivery;
		this.paymentMode = paymentMode;
		this.frequently = frequently;
		this.preferSuppliers = preferSuppliers;
	}

	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDTO [customerName=" + customerName + ", email=" + email + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + " , phone=" + phone + ", requirementNote=" + requirementNote
				+ ", delivery=" + delivery + ", paymentMode=" + paymentMode + ", purpose=" + purpose + ", frequently="
				+ Arrays.toString(frequently) + ", preferSuppliers=" + Arrays.toString(preferSuppliers) + "]";
	}

}
