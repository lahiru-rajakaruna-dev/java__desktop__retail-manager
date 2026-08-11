package org.blaze_technologies.retail_manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.blaze_technologies.retail_manager.data_types.EScene;
import org.blaze_technologies.retail_manager.dev_data.AuthenticationState;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private static Scene appScene;
	private static Stage appStage;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage _stage) throws Exception {
		appStage = _stage;

		EScene initialScene = null;
		Parent scene = null;
		String css = null;

		try {
			initialScene = getInitialScene();
			scene = loadFXML(initialScene.getFileName());
			css = loadCSS(initialScene.getFileName());
		} catch (Exception e) {
			System.err.println("Resource reading error");
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

		try {
			appScene = new Scene(scene, 1280, 800);
			appScene.getStylesheets().clear();
			appScene.getStylesheets().add(css);
			appStage.setScene(appScene);
			appStage.setFullScreen(true);
			appStage.show();
		} catch (Exception e) {
			System.err.println("Scene loading error");
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
	}

	private static EScene getInitialScene() {
		if (!AuthenticationState.isAuthed()) {
			return EScene.AUTHENTICATION;
		} else {
			return EScene.APP;
		}
	}

	public static void switchScene(EScene sceneName) {
		loadScene(sceneName);
	}

	public static void loadScene(EScene sceneName) {
		Parent newScene = null;
		String newCss = null;
		try {
			newScene = loadFXML(sceneName.getFileName());
		} catch (FileNotFoundException e) {
			System.err.println(
					"[FXML LOADING ERROR]:NOT FOUND > " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.err.println("[FXML LOADING ERROR]:READ > " + e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

		try {
			newCss = loadCSS(sceneName.getFileName());
		} catch (FileNotFoundException e) {
			System.err.println("[CSS LOADING ERROR]: " + e.getCause());
			e.printStackTrace();
			System.exit(1);
		}

		final String newCssLocked = newCss;
		final Parent newSceneLocked = newScene;

		Platform.runLater(() -> {
			appScene.getStylesheets().clear();
			appScene.getStylesheets().add(newCssLocked);
			appScene.setRoot(newSceneLocked);
			System.out.println(appStage.getScene().getRoot());

		});
	}

	private static String loadCSS(String fileName)
			throws FileNotFoundException {
		URL cssURL = App.class.getResource(String.format(
				"/org/blaze_technologies/retail_manager/%s.css", fileName));
		if (cssURL == null) {
			throw new FileNotFoundException("Could not find css file");
		}
		return cssURL.toExternalForm();
	}

	private static Parent loadFXML(String fileName)
			throws FileNotFoundException, IOException {
		URL fxmlUrl = App.class.getResource(String.format(
				"/org/blaze_technologies/retail_manager/%s.fxml", fileName));
		if (fxmlUrl == null) {
			throw new FileNotFoundException("Could not find the fxml file");
		}

		FXMLLoader loader = new FXMLLoader(fxmlUrl);
		return loader.load();
	}

}