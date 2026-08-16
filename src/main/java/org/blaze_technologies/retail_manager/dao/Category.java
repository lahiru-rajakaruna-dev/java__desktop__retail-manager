package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

public class Category extends BaseModel {
	private String name;
	private String description;
	private boolean active;

	public Category(int id, UUID public_id, long created_at, long updated_at,
			String name, String description, boolean active) {
		super(id, public_id, created_at, updated_at);
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
				"Category [id=%s, public_id=%s, created_at=%s, updated_at=%s, name=%s, description=%s, active=%s]",
				id, public_id, created_at, updated_at, name, description,
				active);
	}

}
