package org.blaze_technologies.retail_manager.controllers;

import java.util.HashMap;
import java.util.Map;

import org.blaze_technologies.retail_manager.App;
import org.blaze_technologies.retail_manager.data_types.Credentials;
import org.blaze_technologies.retail_manager.data_types.EScene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button loginButton;
	@FXML
	private Button signupButton;

	private HashMap<String, String> credentials = new HashMap<String, String>(
			Map.of("lahiru", "lahiru"));

	@FXML
	private void getUserName(ActionEvent event) {
		TextField element = (TextField) event.getSource();
		System.out.println(element.getText());
		passwordField.requestFocus();
	}

	@FXML
	private void getPassword(ActionEvent event) {
		PasswordField element = (PasswordField) event.getSource();
		System.out.println(element.getText());
		loginButton.requestFocus();
	}

	@FXML
	private void authenticate(ActionEvent event) {
		String username = usernameField.getText();
		String password = passwordField.getText();

		if (!isUserRegistered(username)) {
			System.out.println("User not registered");
			return;
		}

		if (!doesCredentialsMatch(username, password)) {
			System.out.println("Authentication failed");
			return;
		}

		System.out.println("Loading dashboard");
		App.switchScene(EScene.APP);
	}

	private boolean isUserRegistered(String username) {
		if (credentials.containsKey(username)) {
			return true;
		}
		return false;
	}

	private boolean doesCredentialsMatch(String username, String password)
			throws InternalError {
		String credential = credentials.get(username);
		if (credential == null) {
			throw new InternalError("User not registered correctly");
		}

		if (credential.equals(password)) {
			return true;
		}
		return false;
	}

	@FXML
	private void signup(ActionEvent event) {
		Credentials credentials = getCredentialsFromFields();
		if (isUserRegistered(credentials.username())) {
			System.out.println("Username already registered");
			return;
		}
		addCredentials(credentials);
		System.out.println("User registered successfully");
	}

	private Credentials getCredentialsFromFields() {
		String username = usernameField.getText();
		String password = passwordField.getText();
		return new Credentials(username, password);
	}

	private void addCredentials(Credentials creds) {
		credentials.put(creds.username(), creds.password());
	}
}
