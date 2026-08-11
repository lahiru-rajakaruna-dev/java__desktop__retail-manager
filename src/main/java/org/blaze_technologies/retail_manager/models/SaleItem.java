package org.blaze_technologies.retail_manager.models;

import java.math.BigDecimal;
import java.util.UUID;

public class SaleItem extends BaseModel {
	private Sale sale;

	private Product product;

	private int quantity;

	private BigDecimal unit_price;

	private BigDecimal discount;

	private BigDecimal total;

	public SaleItem(int id, UUID public_id, long created_at, long updated_at,
			Sale sale, Product product, int quantity, BigDecimal unit_price,
			BigDecimal discount, BigDecimal total) {
		super(id, public_id, created_at, updated_at);
		this.sale = sale;
		this.product = product;
		this.quantity = quantity;
		this.unit_price = unit_price;
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

	public BigDecimal getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
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
				"SaleItem [id=%s, public_id=%s, created_at=%s, updated_at=%s, sale=%s, product=%s, quantity=%s, unit_price=%s, discount=%s, total=%s]",
				id, public_id, created_at, updated_at, sale, product, quantity,
				unit_price, discount, total);
	}

}
