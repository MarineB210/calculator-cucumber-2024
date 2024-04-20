package calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

import calculator.controller.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The starter class of the calculator application.
 * The class extends an abstract superclass Application.
 * The class is used to start the application when called in the main class.
 * @see Application
 * @see Main
 */
public class AppStarter extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/", "=")); // unused

    /** The start method of the Application class.
     * The method is used to start the application and load the main view.
     * @param stage The stage of the application.
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/MainView.fxml"));
            Parent root = loader.load();
            MainViewController mainViewController = loader.getController();
            mainViewController.setStage(stage);
            Scene scene = new Scene(root);

            addKeyListeners(scene, mainViewController);

            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
            stage.getIcons().add(icon);
            stage.setTitle("Calculator Cucumber");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
            root.requestFocus();
        } catch (IOException e) {
            logger.error("Erreur lors du chargement de l'interface utilisateur", e);
        }
    }

    /** Add key listeners to the scene.
     * @param scene The scene to add the key listeners to.
     * @param mainViewController The controller of the main view.
     */
    private void addKeyListeners(Scene scene, MainViewController mainViewController) {
        scene.setOnKeyPressed(event -> {
                // Zoom in/out/default with Ctrl/Cmd + "+/-/O"
                boolean isMac = System.getProperty("os.name").contains("Mac");
                boolean isModifierDown = isMac ? event.isMetaDown() : event.isControlDown();

                if (isModifierDown) {
                    switch (event.getCode()) {
                        case EQUALS:
                        case ADD:
                            mainViewController.displayZoomIn();
                            break;
                        case MINUS:
                            mainViewController.displayZoomOut();
                            break;
                        case O:
                            mainViewController.displayDefaultZoom();
                            break;
                        default:
                            break;
                    }
                }
                // Delete with Backspace
                if (event.getCode() == javafx.scene.input.KeyCode.BACK_SPACE) {
                    mainViewController.onDelete();
                }
            });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
