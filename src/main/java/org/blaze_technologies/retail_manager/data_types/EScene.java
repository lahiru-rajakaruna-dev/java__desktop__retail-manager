package org.blaze_technologies.retail_manager.data_types;

public enum EScene {
	AUTHENTICATION("login"), APP("application");

	private final String fileName;

	private EScene(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}
}
