package org.blaze_technologies.retail_manager.entities;

import java.util.UUID;

import org.blaze_technologies.retail_manager.data_types.EUserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", indexes = {
		@Index(name = "idx_users_public_id", columnList = "public_id") })
public class User extends BaseEntity {
	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "password_hash", nullable = false)
	private String password_hash;

	@Column(name = "role", nullable = false)
	private EUserRole role;

	@Column(name = "active", nullable = false)
	private boolean active;

	protected User() {
	}

	public User(int id, UUID public_id, long createdAt, long updatedAt,
			String username, String password_hash, EUserRole role,
			boolean active) {
		super(id, public_id, createdAt, updatedAt);
		this.username = username;
		this.password_hash = password_hash;
		this.role = role;
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword_hash() {
		return password_hash;
	}

	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}

	public EUserRole getRole() {
		return role;
	}

	public void setRole(EUserRole role) {
		this.role = role;
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
				"User [id=%s, public_id=%s, createdAt=%s, updatedAt=%s, username=%s, password_hash=%s, role=%s, active=%s]",
				id, public_id, createdAt, updatedAt, username, password_hash,
				role, active);
	}

}
