package org.blaze_technologies.retail_manager.controllers;

import org.blaze_technologies.retail_manager.data_types.EView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class TabbarController {
	private ApplicationController appController;
	@FXML
	private HBox tabbar;
	@FXML
	private Button dashboardTab;
	@FXML
	private Button salesTab;
	@FXML
	private Button productsTab;
	@FXML
	private Button customersTab;
	@FXML
	private Button reportsTab;
	@FXML
	private Button settingsTab;

	public void setAppController(ApplicationController appController) {
		this.appController = appController;
	}

	private void addStyleClassToNode(Node node, String styleClass) {
		node.getStyleClass().add(styleClass);
	}

	private void removeClassFromAllElements(String styleClass) {
		tabbar.getChildren().forEach((node) -> {
			node.getStyleClass().removeAll(styleClass);
		});
	}

	private void updateStyles(ActionEvent e) {
		Object element = e.getSource();
		removeClassFromAllElements("active-tab");
		if (element instanceof Node) {
			addStyleClassToNode((Node) element, "active-tab");
		}
	}

	public void switchToDashboard(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.DASHBOARD);
	}

	public void switchToSales(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.SALES);
	}

	public void switchToProducts(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.PRODUCTS);
	}

	public void switchToCustomers(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.CUSTOMERS);
	}

	public void switchToReports(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.REPORTS);
	}

	public void switchToSettings(ActionEvent e) {
		updateStyles(e);
		appController.switchView(EView.SETTINGS);
	}
}
