package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

public class Customer extends BaseModel {
	private String name;
	private String phone;
	private int credit_limit;
	private boolean active;

	public Customer(int id, UUID public_id, long created_at, long updated_at,
			String name, String phone, int credit_limit, boolean active) {
		super(id, public_id, created_at, updated_at);
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

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
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
				"Customer [id=%s, public_id=%s, created_at=%s, updated_at=%s, name=%s, phone=%s, credit_limit=%s, active=%s]",
				id, public_id, created_at, updated_at, name, phone,
				credit_limit, active);
	}

}
