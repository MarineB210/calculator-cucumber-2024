package calculator.controller.components;

import calculator.Calculator;
import calculator.ComplexNumberParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class ComplexModeController implements Initializable, ModeController {

    @FXML
    private TextField display;
    @FXML
    private TextField expression;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btnPlus;
    @FXML
    private Button btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis;
    @FXML
    private Button btnCloseParenthesis;
    @FXML
    private Button btnComma;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnRetrieve;
    @FXML
    private Button btnDelete; // unused
    @FXML
    private Button btn0;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9; // unused
    @FXML
    private Button btnI;
    @FXML
    private Button btnSqrt;
    @FXML
    private Button btnModulus;
    @FXML
    private Button btnE;
    @FXML
    private Button btnCartesianForm;
    @FXML
    private Button btnPolarForm;
    @FXML
    private Button btnEForm;
    @FXML
    private Button btnCis; // unused
    private boolean resetDisplay = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // default implementation ignored
    }

    // Button click event handlers

    /**
     * Handles the click event on the number buttons.
     *
     * @param event The event that triggered the handler
     */
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    /**
     * Handles the click event on the divide buttons.
     */
    public void onDivide() {
        appendToDisplay("/");
    }

    /**
     * Handles the click event on the multiply buttons.
     */
    public void onMultiply() {
        appendToDisplay("*");
    }

    /**
     * Handles the click event on the minus buttons.
     */
    public void onMinus() {
        appendToDisplay("-");
    }

    /**
     * Handles the click event on the plus buttons.
     */
    public void onPlus() {
        appendToDisplay("+");
    }
    /**
     * Handles the click event on the equals buttons.
     */
    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            Calculator calculator = new Calculator();
            try{
                 ComplexNumberParser parser = new ComplexNumberParser(display.getText(), calculator);
                display.setText(parser.evaluate().toString());}
            catch (Exception e){
                display.setText("Error");
            }
            resetDisplay = true;
        }
    }

    /**
     * Handles the click event on the open parenthesis buttons.
     */
    public void onOpenParenthesis() {
        appendToDisplay("(");
    }

    /**
     * Handles the click event on the close parenthesis buttons.
     */
    public void onCloseParenthesis() {
        appendToDisplay(")");
    }

    /**
     * Handles the click event on the comma buttons.
     */
    public void onComma() {
        if (resetDisplay) {
            display.setText("0,");
            resetDisplay = false;
        } else {
            display.appendText(",");
        }
    }

    /**
     * Handles the click event on the clear buttons.
     */
    public void onClear() {
        if (resetDisplay) {
            expression.appendText(display.getText());
        }
        display.clear();
    }

    /**
     * Handles the click event on the expression buttons.
     */
    public void onE() {
        appendToDisplay("e(i*");
    }

    /**
     * Handles the click event on the i buttons.
     */
    public void onI() {
        appendToDisplay("i");
    }

    /**
     * Handles the click event on the sqrt buttons.
     */
    public void onSqrt() {
        appendToDisplay("sqrt(");
    }

    /**
     * Handles the click event on the modulus buttons.
     */
    public void onModulus() {
        appendToDisplay("|");
    }

    /**
     * Handles the click event on the covert to cartesian buttons.
     */
    public void onCartesianForm() {
        appendToDisplay("intoCartesian(");
    }

    /**
     * Handles the click event on the covert to polar buttons.
     */
    public void onPolarForm() {
        appendToDisplay("intoPolar(");
    }

    /**
     * Handles the click event on the covert to exponential buttons.
     */
    public void onEForm() {
        appendToDisplay("intoE(");
    }

    /**
     * Handles the click event on the cis buttons.
     */
    public void onCis() {
        appendToDisplay("cis(");
    }
    

    // Display event handlers
    public void appendToDisplay(String text) {
        if (resetDisplay) {
            expression.appendText(display.getText());
            display.clear();
        }
        display.appendText(text);
        resetDisplay = false;
    }


    // Setters
     @Override
    public void setDisplayTextField(TextField display) {
        this.display = display;
    }

    @Override
    public void setExpressionTextField(TextField expression) {
        this.expression = expression;
    }

    @Override
    public float getPreferredWidth() {
        return 800;
    }

    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
