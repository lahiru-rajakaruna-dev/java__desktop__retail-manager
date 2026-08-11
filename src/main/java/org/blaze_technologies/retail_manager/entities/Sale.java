package org.blaze_technologies.retail_manager.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales", indexes = {
		@Index(name = "idx_sales_invoice_number", columnList = "invoice_number"),
		@Index(name = "idx_sales_customer_id", columnList = "customer_id"),
		@Index(name = "idx_sales_user_id", columnList = "user_id"),
		@Index(name = "idx_sales_sale_date", columnList = "sale_date") })
public class Sale extends BaseEntity {

	@Column(name = "invoice_number", nullable = false, unique = true, length = 50)
	private String invoiceNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@Column(name = "sale_date", nullable = false)
	private long saleDate;

	@Column(name = "subtotal", nullable = false)
	private double subtotal;

	@Column(name = "discount", nullable = false)
	private double discount;

	@Column(name = "total", nullable = false)
	private double total;

	protected Sale() {
	}

	public Sale(int id, UUID public_id, long createdAt, long updatedAt,
			String invoiceNumber, Customer customer, User user, long saleDate,
			double subtotal, double discount, double total) {
		super(id, public_id, createdAt, updatedAt);
		this.invoiceNumber = invoiceNumber;
		this.customer = customer;
		this.user = user;
		this.saleDate = saleDate;
		this.subtotal = subtotal;
		this.discount = discount;
		this.total = total;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
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

	public long getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(long saleDate) {
		this.saleDate = saleDate;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return String.format(
				"Sale [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, invoiceNumber=%s, customer=%s, user=%s, saleDate=%s, subtotal=%s, discount=%s, total=%s]",
				id, public_id, createdAt, updatedAt, invoiceNumber, customer,
				user, saleDate, subtotal, discount, total);
	}

}