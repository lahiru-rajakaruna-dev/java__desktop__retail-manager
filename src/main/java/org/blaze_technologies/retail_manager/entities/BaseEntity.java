package org.blaze_technologies.retail_manager.entities;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	protected int id;

	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "public_id", nullable = false)
	protected UUID public_id;

	@Column
	protected long createdAt;

	@Column
	protected long updatedAt;

	protected BaseEntity() {
	}

	protected BaseEntity(int id, UUID public_id, long createdAt,
			long updatedAt) {
		this.id = id;
		this.public_id = public_id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@PrePersist
	public void onCreate() {
		if (this.createdAt > 0) {
			return;
		}

		Instant now = Instant.now();
		this.createdAt = now.getEpochSecond();
	}

	@PostUpdate
	public void onUpdate() {
		Instant now = Instant.now();
		this.updatedAt = now.getEpochSecond();
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

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return String.format(
				"BaseEntity [getClass()=%s, id=%s, public_id=%s, createdAt=%s, updatedAt=%s]",
				getClass(), id, public_id, createdAt, updatedAt);
	}

}

// TODO REMOVE getId from all sub entities