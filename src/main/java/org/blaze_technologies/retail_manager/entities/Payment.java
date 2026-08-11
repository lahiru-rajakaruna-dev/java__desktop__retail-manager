package org.blaze_technologies.retail_manager.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments", indexes = {
		@Index(name = "idx_payments_sale_id", columnList = "sale_id"),
		@Index(name = "idx_payments_customer_id", columnList = "customer_id"),
		@Index(name = "idx_payments_user_id", columnList = "user_id"),
		@Index(name = "idx_payments_payment_date", columnList = "payment_date") })
public class Payment extends BaseEntity {

	@Column(name = "sale_id", nullable = false)
	@JoinColumn(name = "id", table = "sales", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Sale sale;

	@Column(name = "customer_id", nullable = false)
	@JoinColumn(name = "id", table = "customers", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;

	@Column(name = "amount", nullable = false)
	private BigDecimal amount;

	@Column(name = "payment_date", nullable = false)
	private long payment_date;

	@Column(name = "user_id", nullable = false)
	@JoinColumn(name = "id", table = "users")
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	@Column(name = "notes", nullable = true)
	private String notes;

	protected Payment() {
	}

	public Payment(int id, UUID public_id, long createdAt, long updatedAt,
			Sale sale, Customer customer, BigDecimal amount, long payment_date,
			User user, String notes) {
		super(id, public_id, createdAt, updatedAt);
		this.sale = sale;
		this.customer = customer;
		this.amount = amount;
		this.payment_date = payment_date;
		this.user = user;
		this.notes = notes;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(long payment_date) {
		this.payment_date = payment_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return String.format(
				"Payment [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, sale=%s, customer=%s, amount=%s, payment_date=%s, user=%s, notes=%s]",
				id, public_id, createdAt, updatedAt, sale, customer, amount,
				payment_date, user, notes);
	}

}
