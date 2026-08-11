package org.blaze_technologies.retail_manager.entities;

import java.math.BigDecimal;
import java.util.UUID;

import org.blaze_technologies.retail_manager.data_types.EStockUpdateType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock_updates")
public class StockUpdate extends BaseEntity {
	@Column(name = "product_id", nullable = false)
	@JoinColumn(name = "id", table = "products")
	@ManyToOne(fetch = FetchType.LAZY)
	private Product product;

	@Column(name = "update_type", nullable = false)
	private EStockUpdateType type;

	@Column(name = "quantity", nullable = false)
	private BigDecimal quantity;

	@Column(name = "reason")
	private String reason;

	@Column(name = "user_id", nullable = false)
	@JoinColumn(name = "id", table = "users")
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	protected StockUpdate() {
	}

	public StockUpdate(int id, UUID public_id, long createdAt, long updatedAt,
			Product product, EStockUpdateType type, BigDecimal quantity,
			String reason, User user) {
		super(id, public_id, createdAt, updatedAt);
		this.product = product;
		this.type = type;
		this.quantity = quantity;
		this.reason = reason;
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public EStockUpdateType getType() {
		return type;
	}

	public void setType(EStockUpdateType type) {
		this.type = type;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return String.format(
				"StockUpdate [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, product=%s, type=%s, quantity=%s, reason=%s, user=%s]",
				id, public_id, createdAt, updatedAt, product, type, quantity,
				reason, user);
	}

}
