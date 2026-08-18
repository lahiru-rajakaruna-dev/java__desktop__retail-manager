package org.blaze_technologies.retail_manager.controllers;

import java.math.BigDecimal;

import org.blaze_technologies.retail_manager.entities.Product;
import org.blaze_technologies.retail_manager.entities.Sale;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class SalesController {
	@FXML
	private BorderPane salesRoot;
	@FXML
	private TabPane salesTabs;
	@FXML
	private TextField productSearchField;
	@FXML
	private ListView<Product> productResultsList;
	@FXML
	private Label selectedProductName;
	@FXML
	private Label selectedProductPrice;
	@FXML
	private TextField quantityField;
	@FXML
	private TextField unitPriceField;
	@FXML
	private TextField discountField;
	@FXML
	private TableView<Sale> saleItemsTable;
	@FXML
	private TableColumn<Sale, String> itemColumn;
	@FXML
	private TableColumn<Sale, Integer> quantityColumn;
	@FXML
	private TableColumn<Sale, BigDecimal> priceColumn;
	@FXML
	private TableColumn<Sale, BigDecimal> discountColumn;
	@FXML
	private TableColumn<Sale, BigDecimal> totalColumn;
	@FXML
	private Label subtotalLabel;
	@FXML
	private Label totalDiscountLabel;
	@FXML
	private Label grandTotalLabel;
	@FXML
	private TextField salesHistorySearchField;
	@FXML
	private TableView<Sale> salesHistoryTable;
	@FXML
	private TableColumn<Sale, String> historyDateColumn;
	@FXML
	private TableColumn<Sale, String> historyInvoiceColumn;
	@FXML
	private TableColumn<Sale, String> historyCustomerColumn;
	@FXML
	private TableColumn<Sale, String> historyItemsColumn;
	@FXML
	private TableColumn<Sale, String> historyAmountColumn;
	@FXML
	private TableColumn<Sale, String> historyPaymentColumn;
	@FXML
	private TableColumn<Sale, String> historyStatusColumn;

}
