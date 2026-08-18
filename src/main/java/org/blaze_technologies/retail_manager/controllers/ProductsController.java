package org.blaze_technologies.retail_manager.controllers;

import java.math.BigDecimal;

import org.blaze_technologies.retail_manager.entities.Category;
import org.blaze_technologies.retail_manager.entities.Product;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class ProductsController {
	@FXML
	private BorderPane productsRoot;
	@FXML
	private Label productCountLabel;
	@FXML
	private TabPane productsTabs;
	@FXML
	private TextField productSearchField;
	@FXML
	private TableView<Product> productsTable;
	@FXML
	private TableColumn<Product, String> codeColumn;
	@FXML
	private TableColumn<Product, String> barcodeColumn;
	@FXML
	private TableColumn<Product, String> nameColumn;
	@FXML
	private TableColumn<Product, String> categoryColumn;
	@FXML
	private TableColumn<Product, String> unitColumn;
	@FXML
	private TableColumn<Product, BigDecimal> stockColumn;
	@FXML
	private TableColumn<Product, BigDecimal> costPriceColumn;
	@FXML
	private TableColumn<Product, BigDecimal> sellingPriceColumn;
	@FXML
	private TableColumn<Product, String> statusColumn;
	@FXML
	private Label selectionStatusLabel;
	@FXML
	private TextField categorySearchField;
	@FXML
	private TableView<Category> categoriesTable;
	@FXML
	private TableColumn<Category, String> categoryNameColumn;
	@FXML
	private TableColumn<Category, String> categoryCodeColumn;
	@FXML
	private TableColumn<Category, Integer> categoryProductCountColumn;
	@FXML
	private TableColumn<Category, String> categoryStatusColumn;

	public void Prodcuts() {
	}

	@FXML
	public void initialize() {
	}

	@FXML
	private void searchProducts(ActionEvent e) {
		System.out.println(e.getSource());
	}

}
