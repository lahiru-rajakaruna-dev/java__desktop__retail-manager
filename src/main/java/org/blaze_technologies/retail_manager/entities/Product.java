package org.blaze_technologies.retail_manager.entities;

import java.math.BigDecimal;
import java.util.UUID;

import org.blaze_technologies.retail_manager.data_types.EMessurementUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products", indexes = {
		@Index(name = "idx_products_barcode", columnList = "barcode"),
		@Index(name = "idx_products_code", columnList = "code"), })
public class Product extends BaseEntity {
	@Column(name = "barcode", nullable = true, unique = true, updatable = false)
	private String barcode;

	@Column(name = "code", nullable = false)
	private int code;

	@Column(name = "name", nullable = true, unique = false, updatable = true)
	private String name;

	@OneToOne(optional = false)
	@JoinColumn(name = "category_id", table = "categories", nullable = false, updatable = true)
	private Category category;

	@Column(name = "meassuerment_unit", nullable = false)
	private EMessurementUnit messurement_unit;

	@Column(name = "cost_price", nullable = false)
	private BigDecimal cost_price;

	@Column(name = "selling_price", nullable = false)
	private BigDecimal selling_price;

	@Column(name = "stock_quantity", nullable = false)
	private BigDecimal stock_quantity;

	@Column(name = "reorder_level", nullable = false)
	private int reorder_level;

	@Column(name = "active", nullable = false)
	private boolean active;

	protected Product() {
	}

	public Product(int id, UUID public_id, long createdAt, long updatedAt,
			String barcode, int code, String name, Category category,
			EMessurementUnit messurement_unit, BigDecimal cost_price,
			BigDecimal selling_price, BigDecimal stock_quantity,
			int reorder_level, boolean active) {
		super(id, public_id, createdAt, updatedAt);
		this.barcode = barcode;
		this.code = code;
		this.name = name;
		this.category = category;
		this.messurement_unit = messurement_unit;
		this.cost_price = cost_price;
		this.selling_price = selling_price;
		this.stock_quantity = stock_quantity;
		this.reorder_level = reorder_level;
		this.active = active;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public EMessurementUnit getMessurement_unit() {
		return messurement_unit;
	}

	public void setMessurement_unit(EMessurementUnit messurement_unit) {
		this.messurement_unit = messurement_unit;
	}

	public BigDecimal getCost_price() {
		return cost_price;
	}

	public void setCost_price(BigDecimal cost_price) {
		this.cost_price = cost_price;
	}

	public BigDecimal getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(BigDecimal selling_price) {
		this.selling_price = selling_price;
	}

	public BigDecimal getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(BigDecimal stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public int getReorder_level() {
		return reorder_level;
	}

	public void setReorder_level(int reorder_level) {
		this.reorder_level = reorder_level;
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
				"Product [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, barcode=%s, code=%s, name=%s, category=%s, messurement_unit=%s, cost_price=%s, selling_price=%s, stock_quantity=%s, reorder_level=%s, active=%s]",
				id, public_id, createdAt, updatedAt, barcode, code, name,
				category, messurement_unit, cost_price, selling_price,
				stock_quantity, reorder_level, active);
	}

}
