package org.blaze_technologies.retail_manager.controllers;

import java.math.BigDecimal;

import org.blaze_technologies.retail_manager.entities.Sale;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class DashboardController {
	@FXML
	private BorderPane dashboardRoot;
	@FXML
	private TableView<Sale> recentTransactionsTable;
	@FXML
	private TableColumn<Sale, String> invoiceColumn;
	@FXML
	private TableColumn<Sale, String> customerColumn;
	@FXML
	private TableColumn<Sale, BigDecimal> amountColumn;
	@FXML
	private TableColumn<Sale, String> statusColumn;

}
