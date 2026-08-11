package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

public class Product extends BaseModel {
	private String barcode;

	private String name;

	private Category category;

	private int unit;

	private double cost_price;

	private double selling_price;

	private int reorder_level;

	private int stock_quantity;

	private boolean active;

	public Product(int id, UUID public_id, long created_at, long updated_at,
			String barcode, String name, Category category, int unit,
			double cost_price, double selling_price, int reorder_level,
			int stock_quantity, boolean active) {
		super(id, public_id, created_at, updated_at);
		this.barcode = barcode;
		this.name = name;
		this.category = category;
		this.unit = unit;
		this.cost_price = cost_price;
		this.selling_price = selling_price;
		this.reorder_level = reorder_level;
		this.stock_quantity = stock_quantity;
		this.active = active;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public double getCost_price() {
		return cost_price;
	}

	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}

	public double getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(double selling_price) {
		this.selling_price = selling_price;
	}

	public int getReorder_level() {
		return reorder_level;
	}

	public void setReorder_level(int reorder_level) {
		this.reorder_level = reorder_level;
	}

	public int getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
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
				"Product [id=%s, public_id=%s, created_at=%s, updated_at=%s, barcode=%s, name=%s, category=%s, unit=%s, cost_price=%s, selling_price=%s, reorder_level=%s, stock_quantity=%s, active=%s]",
				id, public_id, created_at, updated_at, barcode, name, category,
				unit, cost_price, selling_price, reorder_level, stock_quantity,
				active);
	}

}
