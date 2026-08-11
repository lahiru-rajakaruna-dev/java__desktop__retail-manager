package org.blaze_technologies.retail_manager.data_types;

public enum EUserRole {
	GOD("GOD"), ADMIN("ADMIN"), USER("USER");

	private final String role;

	private EUserRole(String role) {
		this.role = role;
	}

	public String getValue() {
		return this.role;
	}
}
