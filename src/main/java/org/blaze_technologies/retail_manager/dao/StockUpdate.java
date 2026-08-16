package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

import org.blaze_technologies.retail_manager.data_types.EStockUpdateType;

public class StockUpdate extends BaseModel {

	private Product product;

	private EStockUpdateType type;

	private int quantity;

	private String reason;

	private User user;

	public StockUpdate(int id, UUID public_id, long created_at, long updated_at,
			Product product, EStockUpdateType type, int quantity, String reason,
			User user) {
		super(id, public_id, created_at, updated_at);
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
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
				"StockUpdate [id=%s, public_id=%s, created_at=%s, updated_at=%s, product=%s, type=%s, quantity=%s, reason=%s, user=%s]",
				id, public_id, created_at, updated_at, product, type, quantity,
				reason, user);
	}

}
