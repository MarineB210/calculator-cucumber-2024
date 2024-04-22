package calculator.controller.components;


import calculator.BooleanParser;
import calculator.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BooleanModeController implements Initializable, ModeController{

    @FXML
    private TextField display, expression;
    @FXML
    private Button btnNot, btnAnd, btnOr, btnXor, btnEquiv, btnImply, btnEquals; // unused
    @FXML
    private Button btnOpenParenthesis, btnCloseParenthesis, btnComma, btnClear, btnRetrieve, btnDelete; // unused
    @FXML
    private Button btn0, btn1;

    private final Map<String, String> dictionary = new HashMap<>();
    private boolean resetDisplay = false;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dictionary.put("¬", "NOT");
        dictionary.put("∨", "OR");
        dictionary.put("∧", "AND");
        dictionary.put("⊕", "XOR");
        dictionary.put("→", "IMPL");
        dictionary.put("↔", "EQ");
    }

    // Button click event handlers
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    public void onNot() {
        appendToDisplay(" ¬ ");
    }

    public void onOr() {
        appendToDisplay(" ∨ ");
    }

    public void onAnd() {
        appendToDisplay(" ∧ ");
    }

    public void onXor() {
        appendToDisplay(" ⊕ ");
    }

    public void onImply() {
        appendToDisplay(" → ");
    }

    public void onEquiv() {
        appendToDisplay(" ↔ ");
    }

    public void onEquals() {
        if (!resetDisplay && !display.getText().equals("0")) {
            expression.setText(display.getText()+" = ");
            Calculator calculator = new Calculator();
            try{

                BooleanParser parser = new BooleanParser(handleSymbols(display.getText()), calculator);
                display.setText(parser.evaluate().toString());}
            catch (Exception e){
                display.setText("Error");
            }
            resetDisplay = true;
        }
    }

    /**
     * Handle boolean symbols to convert them into their counterpart which uses letters.
     *
     * @return The converted string.
     * **/
    private String handleSymbols(String text){
        StringBuilder stringExpression = new StringBuilder();
        for(String elem : text.split(" ")){
            if(dictionary.containsKey(elem)){
                stringExpression.append(dictionary.get(elem));
            }
            else {
                stringExpression.append(elem);
            }
        }
        return stringExpression.toString();
    }


    public void onOpenParenthesis() {
        appendToDisplay("(");
    }

    public void onCloseParenthesis() {
        appendToDisplay(")");
    }

    public void onComma() {
        if (resetDisplay) {
            display.setText("0,");
            resetDisplay = false;
        } else {
            display.appendText(",");
        }
    }

    public void onClear() {
        if (resetDisplay) {
            expression.appendText(display.getText());
        }
        display.clear();
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
        return 480;
    }

    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
