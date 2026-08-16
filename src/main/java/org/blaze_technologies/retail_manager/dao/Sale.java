package org.blaze_technologies.retail_manager.models;

import java.math.BigDecimal;
import java.util.UUID;

public class Sale extends BaseModel {
	private String invoice_number;

	private Customer customer;

	private User user;

	private long sale_date;

	private BigDecimal subtotal;

	private BigDecimal discount;

	private BigDecimal total;

	public Sale(int id, UUID public_id, long created_at, long updated_at,
			String invoice_number, Customer customer, User user, long sale_date,
			BigDecimal subtotal, BigDecimal discount, BigDecimal total) {
		super(id, public_id, created_at, updated_at);
		this.invoice_number = invoice_number;
		this.customer = customer;
		this.user = user;
		this.sale_date = sale_date;
		this.subtotal = subtotal;
		this.discount = discount;
		this.total = total;
	}

	public String getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getSale_date() {
		return sale_date;
	}

	public void setSale_date(long sale_date) {
		this.sale_date = sale_date;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return String.format(
				"Sale [id=%s, public_id=%s, created_at=%s, updated_at=%s, invoice_number=%s, customer=%s, user=%s, sale_date=%s, subtotal=%s, discount=%s, total=%s]",
				id, public_id, created_at, updated_at, invoice_number, customer,
				user, sale_date, subtotal, discount, total);
	}

}
