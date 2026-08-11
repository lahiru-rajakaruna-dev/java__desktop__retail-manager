package org.blaze_technologies.retail_manager.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers", indexes = {
		@Index(name = "idx_customers_phone", columnList = "phone") })
public class Customer extends BaseEntity {
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "credit_limit", nullable = false)
	private BigDecimal credit_limit;

	@Column(name = "active", nullable = false)
	private boolean active;

	protected Customer() {
	}

	public Customer(int id, UUID public_id, long createdAt, long updatedAt,
			String name, String phone, BigDecimal credit_limit,
			boolean active) {
		super(id, public_id, createdAt, updatedAt);
		this.name = name;
		this.phone = phone;
		this.credit_limit = credit_limit;
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(BigDecimal credit_limit) {
		this.credit_limit = credit_limit;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, name=%s, phone=%s, credit_limit=%s, active=%s]",
				id, public_id, createdAt, updatedAt, name, phone, credit_limit,
				active);
	}

}
