package calculator.controller;

import calculator.controller.components.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    public static final String STANDARD_MODE = "Standard";
    public static final String RATIONAL_MODE = "Rational";
    public static final String COMPLEX_MODE = "Complex";
    public static final String CONVERSIONS_MODE = "Conversions";
    public static final String TIME_MODE = "Time";
    public static final String BOOLEAN_MODE = "Boolean";

    private static final Logger logger = LoggerFactory.getLogger(MainViewController.class);

    @FXML
    private BorderPane root;
    @FXML
    private CheckMenuItem standardMode, rationalMode, complexMode, booleanMode, timeMode, conversionsMode;
    @FXML
    private Menu modeMenu, zoomMenu; // unused
    @FXML
    private MenuItem zoomIn, zoomOut, zoomDefault; // unused
    @FXML
    private VBox displayContainer; // unused
    @FXML
    private TextField display, expression;
    @FXML
    private Button btnDivide, btnMultiply, btnMinus, btnPlus, btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnRetrieve, btnDelete; // unused
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; // unused

    private Stage stage;
    private List<CheckMenuItem> modeMenuItems;
    private String currentMode;
    private boolean resetDisplay = false; // maybe protected variable
    private boolean fromConversionsMode = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modeMenuItems = List.of(standardMode, rationalMode, complexMode, timeMode, conversionsMode);
        updateMode(STANDARD_MODE);
    }

    // click event handlers
    public void onRetrieve() {
        String expressionString = expression.getText();
        int index = expressionString.lastIndexOf("=");
        if (index != -1 && index < expressionString.length() - 2) {
            String retrieved = expressionString.substring(index + 2);
            if (!retrieved.equals(display.getText())) {
                display.setText(display.getText() + retrieved);
                resetDisplay = false;
            }
        }
    }

    // Mode change event handlers
    @FXML
    private void onStandardMode() {
        if (!currentMode.equals(STANDARD_MODE)) {
            updateMode(STANDARD_MODE);
        }
    }

    @FXML
    private void onRationalMode() {
        if (!currentMode.equals(RATIONAL_MODE)) {
            updateMode(RATIONAL_MODE);
        }
    }

    @FXML
    private void onComplexMode() {
        if (!currentMode.equals(COMPLEX_MODE)) {
            updateMode(COMPLEX_MODE);
        }
    }

    @FXML
    private void onConversionsMode() {
        if (!currentMode.equals(CONVERSIONS_MODE)) {
            updateMode(CONVERSIONS_MODE);
        }
    }
    
    @FXML
    private void onTimeMode() {
        if (!currentMode.equals(TIME_MODE)) {
            updateMode(TIME_MODE);
        }
    }

    @FXML
    private void onBooleanMode() {
        if (!currentMode.equals(BOOLEAN_MODE)) {
            updateMode(BOOLEAN_MODE);
        }
    }

    /**
     * Updates the current mode and associated buttons.
     *
     * @param mode the mode to be activated.
     */
    private void updateMode(String mode) {
        currentMode = mode;
        for (CheckMenuItem item : modeMenuItems) {
            item.setSelected(item.getText().equals(currentMode));
        }
        loadModeComponent(mode);
    }

    /**
     * Loads the FXML file for the specified mode and sets the mode controller.
     *
     * @param mode the mode to be loaded.
     */
    private void loadModeComponent(String mode) {
        String fxmlFile = String.format("/fxml/components/%sModeComponent.fxml", mode);
        URL resource = getClass().getResource(fxmlFile);

        if (resource == null) {
            logger.error("FXML file for " + mode + " mode not found : " + fxmlFile);
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(resource);
                GridPane modeGrid;
                if (!fromConversionsMode && !mode.equals(CONVERSIONS_MODE)){
                    modeGrid = loader.load();
                } else {
                    VBox topVBox = (VBox) root.getTop();
                    if (fromConversionsMode) {
                        modeGrid = loader.load();
                        VBox displayVBox = this.displayContainer;
                        topVBox.getChildren().set(1, displayVBox);
                        fromConversionsMode = false;
                    } else {
                        BorderPane conversionsPane = loader.load();
                        VBox conversionsVBox = (VBox) conversionsPane.getChildren().get(0);
                        modeGrid = (GridPane) conversionsPane.getChildren().get(1);
                        topVBox.getChildren().set(1, conversionsVBox);
                        fromConversionsMode = true;
                    }
                    root.setTop(topVBox);
                }

                root.setCenter(modeGrid);
                ModeController modeController = loader.getController();

                // Resize the window to the mode controller's preferred size
                if(this.stage != null) {
                    stage.setWidth(modeController.getPreferredWidth());
                    stage.setHeight(modeController.getPreferredHeight() + getTitleBarHeight());
                }

                // Passing text fields to mode controllers
                modeController.setDisplayTextField(display);
                modeController.setExpressionTextField(expression);
            } catch (IOException e) {
                logger.error("Error loading buttons for the" + mode + "mode.", e);
            }
        }
    }

    public double getTitleBarHeight() {
        return stage.getHeight() - stage.getScene().getHeight();
    }

    // Display event handlers
    public void handleExpressionFieldClick(MouseEvent mouseEvent) {
        onRetrieve();
        root.requestFocus();
    }

    public void handleDisplayFieldClick(MouseEvent mouseEvent) {
        root.requestFocus();
    }

    public void displayZoomIn() {
        double size = display.getFont().getSize();
        if (size < 72) {
            display.setStyle("-fx-font-size: " + (size + 2) + "px;");
        }
    }

    public void displayZoomOut() {
        double size = display.getFont().getSize();
        display.setStyle("-fx-font-size: " + (size - 2) + "px;");
    }

    public void displayDefaultZoom() {
        display.setStyle("-fx-font-size: 72px;");
    }

    public void onDelete() {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        if (!display.getText().isEmpty()) {
            display.setText(display.getText(0, display.getText().length() - 1));
        }
    }

    // Setters
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
