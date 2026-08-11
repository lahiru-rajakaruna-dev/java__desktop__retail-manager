package org.blaze_technologies.retail_manager.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@Column(name = "description", length = 250)
	private String description;

	@Column(name = "active", nullable = false)
	private boolean active;

	protected Category() {
	}

	public Category(int id, UUID public_id, long createdAt, long updatedAt,
			String name, String description, boolean active) {
		super(id, public_id, createdAt, updatedAt);
		this.name = name;
		this.description = description;
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
				"Category [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, name=%s, description=%s, active=%s]",
				id, public_id, createdAt, updatedAt, name, description, active);
	}

}
