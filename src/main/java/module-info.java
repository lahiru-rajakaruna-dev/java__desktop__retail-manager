module org.blaze_technologies.retail_manager {
	requires javafx.controls;
	requires javafx.fxml;
	requires jakarta.persistence;
	requires org.hibernate.orm.core;

	opens org.blaze_technologies.retail_manager.data_types
			to org.blaze_technologies.retail_manager.controllers;
	opens org.blaze_technologies.retail_manager.controllers to javafx.fxml;

	exports org.blaze_technologies.retail_manager;
	exports org.blaze_technologies.retail_manager.controllers;
	exports org.blaze_technologies.retail_manager.data_types;
	exports org.blaze_technologies.retail_manager.dao;
	exports org.blaze_technologies.retail_manager.hibernate;
}
