package org.blaze_technologies.retail_manager.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.blaze_technologies.retail_manager.App;
import org.blaze_technologies.retail_manager.data_types.EView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class ApplicationController {
	private String rootPackage = App.class.getPackageName().replace('.', '/');
	@FXML
	private Node appRoot;
	@FXML
	private TabbarController tabbarController;

	private Parent currentView;
	private String currentViewCss;

	public void initialize() {
		tabbarController.setAppController(this);
	}

	public void switchView(EView view) {
		System.out.printf("Switching View to %s\n", view.getFileName());
		loadView(view);
		swap();
	}

	private void swap() {
		if (appRoot instanceof BorderPane) {
			((BorderPane) appRoot).setCenter(currentView);
		} else {
			System.err.println("Not A BorderPane");
		}
	}

	private void loadView(EView view) {

		try {
			currentView = loadFXML(view.getFileName());
		} catch (FileNotFoundException e) {
			System.err.println("LOAD FXML: " + e.getCause());
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.err.println("READ FXML: " + e.getCause());
			e.printStackTrace();
			System.exit(1);
		}

		try {
			currentViewCss = loadCSS(view.getFileName());
		} catch (FileNotFoundException e) {
			System.err.println("LOAD FXML: " + e.getCause());
			e.printStackTrace();
			System.exit(1);
		}

		if (currentView == null || currentViewCss == null) {
			throw new InternalError("No CSS file or No Parent Element");
		}

		currentView.getStylesheets().add(currentViewCss);
	}

	private Parent loadFXML(String fileName)
			throws FileNotFoundException, IOException {
		URL fxmlFileUrl = ApplicationController.class.getResource(
				String.format("/%s/%s.fxml", rootPackage, fileName));

		if (fxmlFileUrl == null) {
			String searchedFileUrl = String.format("/%s/%s.fxml", rootPackage,
					fileName);
			System.out.println(searchedFileUrl);
			throw new FileNotFoundException(
					String.format("Could not find the %s.fxml", fileName));
		}

		FXMLLoader loader = new FXMLLoader(fxmlFileUrl);
		return loader.load();
	}

	private String loadCSS(String fileName) throws FileNotFoundException {
		URL cssFileUrl = ApplicationController.class.getResource(
				String.format("/%s/%s.css", rootPackage, fileName));
		if (cssFileUrl == null) {
			System.out.println(
					String.format("/%s/%s.css", rootPackage, fileName));
			throw new FileNotFoundException(
					String.format("Could not find the %s.css", fileName));
		}

		return cssFileUrl.getFile();
	}

}
