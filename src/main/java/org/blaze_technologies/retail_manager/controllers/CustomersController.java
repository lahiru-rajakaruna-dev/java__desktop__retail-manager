package org.blaze_technologies.retail_manager.controllers;

import java.math.BigDecimal;

import org.blaze_technologies.retail_manager.entities.Customer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class CustomersController {
	@FXML
	private BorderPane customersRoot;
	@FXML
	private Label customerCountLabel;
	@FXML
	private Label outstandingBalanceLabel;
	@FXML
	private TabPane customersTabs;
	@FXML
	private TextField customerSearchField;
	@FXML
	private TableView<Customer> customersTable;
	@FXML
	private TableColumn<Customer, String> customerCodeColumn;
	@FXML
	private TableColumn<Customer, String> customerNameColumn;
	@FXML
	private TableColumn<Customer, String> phoneColumn;
	@FXML
	private TableColumn<Customer, BigDecimal> totalPurchasesColumn;
	@FXML
	private TableColumn<Customer, BigDecimal> balanceColumn;
	@FXML
	private TableColumn<Customer, Long> lastPurchaseColumn;
	@FXML
	private TableColumn<Customer, String> statusColumn;
	@FXML
	private Label selectedCustomerName;
	@FXML
	private Label selectedCustomerPhone;
	@FXML
	private Label selectedCustomerBalance;
	@FXML
	private Label historyCustomerName;
	@FXML
	private TableView<Customer> customerHistoryTable;
	@FXML
	private TableColumn<Customer, Long> historyDateColumn;
	@FXML
	private TableColumn<Customer, String> historyReferenceColumn;
	@FXML
	private TableColumn<Customer, String> historyTypeColumn;
	@FXML
	private TableColumn<Customer, BigDecimal> historyAmountColumn;
	@FXML
	private TableColumn<Customer, BigDecimal> historyPaidColumn;
	@FXML
	private TableColumn<Customer, BigDecimal> historyBalanceColumn;
	@FXML
	private TableColumn<Customer, String> historyStatusColumn;

}
