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
@Table(name = "BMDT_PRODUCT")
public class BmqProduct extends AbstractEntity implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	@Column(name = "PRODUCT_ID", unique = true)
	@Id
	@SequenceGenerator(name = "ProductIDSeq", sequenceName = "SEQ_PRODUCT_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProductIDSeq")
	private Long productId;

	@Column(name = "PRODUCT_CODE", unique = true)
	private String productCode;

	@Column(name = "AVATAR_LINK")
	private String avatarLink;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getAvatarLink() {
		return avatarLink;
	}

	public void setAvatarLink(String avatarLink) {
		this.avatarLink = avatarLink;
	}

}
