package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

public class Payment extends BaseModel {
	private final int customer_id;

	private double amount;

	private long payment_date;

	private final int user_id;

	private String notes;

	public Payment(int id, UUID public_id, long created_at, long updated_at,
			int customer_id, double amount, long payment_date, int user_id,
			String notes) {
		super(id, public_id, created_at, updated_at);
		this.customer_id = customer_id;
		this.amount = amount;
		this.payment_date = payment_date;
		this.user_id = user_id;
		this.notes = notes;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(long payment_date) {
		this.payment_date = payment_date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public int getUser_id() {
		return user_id;
	}

	@Override
	public String toString() {
		return String.format(
				"Payment [id=%s, public_id=%s, created_at=%s, updated_at=%s, customer_id=%s, amount=%s, payment_date=%s, user_id=%s, notes=%s]",
				id, public_id, created_at, updated_at, customer_id, amount,
				payment_date, user_id, notes);
	}

}
