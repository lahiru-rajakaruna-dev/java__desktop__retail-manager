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
@Table(name = "sale_items", indexes = {
		@Index(name = "idx_sale_items_sale_id", columnList = "sale_id"),
		@Index(name = "idx_sale_items_product_id", columnList = "product_id") })
public class SaleItem extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "sale_id", nullable = false)
	private Sale sale;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "unit_price", nullable = false, precision = 19, scale = 2)
	private BigDecimal unitPrice;

	@Column(name = "discount", nullable = false, precision = 19, scale = 2)
	private BigDecimal discount;

	@Column(name = "total", nullable = false, precision = 19, scale = 2)
	private BigDecimal total;

	// Required by Hibernate
	protected SaleItem() {
	}

	public SaleItem(int id, UUID public_id, long createdAt, long updatedAt,
			Sale sale, Product product, int quantity, BigDecimal unitPrice,
			BigDecimal discount, BigDecimal total) {
		super(id, public_id, createdAt, updatedAt);
		this.sale = sale;
		this.product = product;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.total = total;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
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
				"SaleItem [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, sale=%s, product=%s, quantity=%s, unitPrice=%s, discount=%s, total=%s]",
				id, public_id, createdAt, updatedAt, sale, product, quantity,
				unitPrice, discount, total);
	}

}