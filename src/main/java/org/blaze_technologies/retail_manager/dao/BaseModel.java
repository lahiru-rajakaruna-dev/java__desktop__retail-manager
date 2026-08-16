package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

public abstract class BaseModel {
	protected int id;

	protected UUID public_id;

	protected long created_at;

	protected long updated_at;

	protected BaseModel(int id, UUID public_id, long created_at,
			long updated_at) {
		this.id = id;
		this.public_id = public_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UUID getPublic_id() {
		return public_id;
	}

	public void setPublic_id(UUID public_id) {
		this.public_id = public_id;
	}

	@Override
	public String toString() {
		return String.format("BaseModel [id=%s, public_id=%s, getClass()=%s]",
				id, public_id, getClass());
	}

}
// TODO make all currency types BigDecimal. BigDecimal goodValue = BigDecimal.valueOf(number);