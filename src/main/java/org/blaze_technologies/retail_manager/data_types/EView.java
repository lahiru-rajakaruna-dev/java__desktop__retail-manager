package org.blaze_technologies.retail_manager.data_types;

public enum EView {
	DASHBOARD("dashboard"), SALES("sales"), POS("pos"), PRODUCTS("products"), CUSTOMERS("customers"),
	SETTINGS("settings"), REPORTS("reports");

	private final String fileName;

	private EView(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

}
