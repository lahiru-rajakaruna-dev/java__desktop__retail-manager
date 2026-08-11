package org.blaze_technologies.retail_manager.models;

import java.util.UUID;

import org.blaze_technologies.retail_manager.data_types.EUserRole;

public class User extends BaseModel {
	private String username;
	private String password_hash;
	private EUserRole role;
	private boolean active;

	public User(int id, UUID public_id, long created_at, long updated_at,
			String username, String password_hash, EUserRole role,
			boolean active) {
		super(id, public_id, created_at, updated_at);
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
				"User [id=%s, public_id=%s, created_at=%s, updated_at=%s, username=%s, password_hash=%s, role=%s, active=%s]",
				id, public_id, created_at, updated_at, username, password_hash,
				role, active);
	}

}
