package org.blaze_technologies.retail_manager.data_types;

public enum EStockUpdateType {
	PURCHASE("PURCHASE"), SALE("SALE"), SALE_RETURN("SALE_RETURN"),
	PURCHASE_RETURN("PURCHASE_RETURN"), ADJUSTMENT_IN("ADJUSTMENT_IN"),
	ADJUSTMENT_OUT("ADJUSTMENT_OUT");

	private final String value;

	private EStockUpdateType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
