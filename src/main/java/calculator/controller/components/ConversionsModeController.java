package calculator.controller.components;

import calculator.conversions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class handles user interactions for the conversion mode of the application.
 * It allows to convert values between different units of measure.
 */
public class ConversionsModeController implements Initializable, ModeController {

    @FXML
    private GridPane conversionsGrid;
    @FXML
    private VBox conversionsVBox;
    @FXML
    private Button btnClear, btnDelete;
    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnConvert;
    @FXML
    private TextField textFieldFrom1;
    @FXML
    private TextField textFieldFrom2;
    @FXML
    private TextField textFieldTo1;
    @FXML
    private TextField textFieldTo2;
    @FXML
    private ComboBox<UnitType> unitTypeComboBox;
    @FXML
    public ComboBox<Unit> comboBoxFromUnit;
    @FXML
    public ComboBox<Unit> comboBoxToUnit;
    private TextField display;
    private TextField expression;

    /**
     * A flag indicating whether the display should be reset.
     * If true, the next input will clear the display before appending the input.
     */
    private boolean resetDisplay = false;

    /**
     * A flag indicating where the focus is.
     * If true, the focus is on 'textFieldFrom1', meaning that any subsequent input will be appended to 'textFieldFrom1'.
     * If false, the focus is on 'textFieldFrom2', meaning that any subsequent input will be appended to 'textFieldFrom2'.
     */
    private boolean focusOnFrom1 = true;

    /**
     * A flag indicating whether the unit has been changed.
     * If true, the conversion will be performed when the 'Convert' button is clicked.
     */
    private boolean changedUnit = true;

    /**
     * The type of unit for the conversion.
     */
    private UnitType unitType;

    /**
     * The unit from which the value is to be converted.
     */
    private Unit fromUnit;

    /**
     * The unit to which the value is to be converted.
     */
    private Unit toUnit;

    /**
     * Method to initialize the controller. It is called after all FXML elements have been loaded.
     * It initializes the ComboBoxes with the unit types and default units.
     *
     * @param url The location used to resolve relative paths for the root object, or null if the location is not known.
     * @param resourceBundle The resources used to localize the root object, or null if the root object is not localized.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        unitTypeComboBox.setConverter(new StringConverter<UnitType>() {
            @Override
            public String toString(UnitType unitType) {
                if (unitType == null) {
                    return null;
                } else {
                    return unitType.getName();
                }
            }
            @Override
            public UnitType fromString(String s) {
                return null;
            }
        });
        getUnitName(comboBoxFromUnit);
        getUnitName(comboBoxToUnit);

        unitTypeComboBox.getItems().setAll(UnitType.values());
        unitTypeComboBox.setValue(UnitType.LENGTH);
        unitTypeComboBox.setOnAction(event -> setUnits());
        setUnits();
        comboBoxFromUnit.setOnAction(event -> {
            fromUnit = comboBoxFromUnit.getValue();
            changedUnit = true;
        });
        comboBoxToUnit.setOnAction(event -> {
            toUnit = comboBoxToUnit.getValue();
            changedUnit = true;
        });
        fromUnit = comboBoxFromUnit.getValue();
        toUnit = comboBoxToUnit.getValue();
    }

    /**
     * Sets the display name for the units in the provided ComboBox.
     * This method uses a StringConverter to control how the Unit objects are converted to strings for display.
     *
     * @param comboBoxToUnit The ComboBox whose display names are to be set.
     */
    private void getUnitName(ComboBox<Unit> comboBoxToUnit) {
        comboBoxToUnit.setConverter(new StringConverter<Unit>() {
            @Override
            public String toString(Unit unit) {
                if (unit == null) {
                    return null;
                } else {
                    return unit.getName();
                }
            }
            @Override
            public Unit fromString(String string) {
                return null;
            }
        });
    }

    /**
     * This method sets the units for the conversion based on the selected UnitType.
     * If the selected UnitType is different from the current one, it updates the unitType,
     * sets the fromUnit and toUnit to the first two units of the new UnitType, and flags that the unit has changed.
     */
    private void setUnits() {
        if (unitType == null || !unitType.equals(unitTypeComboBox.getValue())) {
            unitType = unitTypeComboBox.getValue();
            Unit[] units = getEnumValues(unitType);
            comboBoxFromUnit.getItems().setAll(units);
            comboBoxFromUnit.setValue(units[0]);
            fromUnit = units[0];
            comboBoxToUnit.getItems().setAll(units);
            comboBoxToUnit.setValue(units[1]);
            toUnit = units[1];
            changedUnit = true;
        }
    }

    /**
     * This method returns an array of Unit objects based on the provided UnitType.
     * It uses a switch statement to determine which type of Unit objects to return.
     *
     * @param unitType The type of units to return. This should be one of the values defined in the UnitType enum.
     * @return An array of Unit objects of the specified type.
     */
    private Unit[] getEnumValues(UnitType unitType) {
        return switch (unitType) {
            case LENGTH -> LengthUnit.values();
            case TIME -> TimeUnit.values();
            case AREA -> AreaUnit.values();
            case MASS -> MassAndWeightUnit.values();
            case POWER -> PowerUnit.values();
            case PRESSURE -> PressureUnit.values();
            case VOLUME -> VolumeUnit.values();
            case SPEED -> SpeedUnit.values();
            case ENERGY -> EnergyUnit.values();
            case CURRENCY -> CurrencyUnit.values();
            case TEMPERATURE -> TemperatureUnit.values();
        };
    }

    /**
     * This method appends the provided text to the TextField that currently has focus.
     * If the resetDisplay flag is set, it first clears all TextFields.
     * It also ensures that the length of the text in the TextField does not exceed 10 characters.
     *
     * @param text The text to append to the TextField.
     */
    public void appendToDisplay(String text) {
        if (resetDisplay) {
            textFieldFrom1.clear();
            textFieldFrom2.clear();
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        }
        if (focusOnFrom1 && textFieldFrom1.getText().length() < 10) {
            textFieldFrom1.appendText(text);
        } else if (!focusOnFrom1 && textFieldFrom2.getText().length() < 10){
            textFieldFrom2.appendText(text);
        }
    }

    /**
     * This method is responsible for converting the values entered by the user from the source unit to the target unit.
     * If the conditions are met, it creates a new Convertor object and uses it to convert the value
     * from the source unit to the target unit. The result of the conversion is then displayed in the target TextFields.
     */
    public void onConvert() {
        if (resetDisplay && fromUnit.equals(toUnit)) {
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        } else if ((!resetDisplay || changedUnit) && !(textFieldFrom1.getText().isEmpty() && textFieldFrom2.getText().isEmpty())
                && !fromUnit.equals(toUnit)) {
            Convertor convertor;
            if (unitType == UnitType.TEMPERATURE) {
                convertor = new Convertor(getExpressionDouble(), (TemperatureUnit) fromUnit, (TemperatureUnit) toUnit);
            } else {
                convertor = new Convertor(getExpressionDouble(), fromUnit, toUnit);
            }
            textFieldTo1.setText(convertor.getIntegerPart());
            textFieldTo2.setText(convertor.getDecimalPart());
            resetDisplay = true;
            changedUnit = false;
        }
    }

    /**
     * This method converts the text given by the user into a double value.
     *
     * @return The double value provided by the user.
     */
    private double getExpressionDouble() {
        String from1 = textFieldFrom1.getText();
        String from2 = textFieldFrom2.getText();
        String result;
        if (from1.isEmpty()) {
            result = "0." + from2;
        } else if (from2.isEmpty()) {
            result = from1 + ".0";
        } else {
            result = from1 + "." + from2;
        }
        return Double.parseDouble(result);
    }

    /**
     * This method is called when the user clicks on the input integer part TextField.
     * It sets the focus on 'textFieldFrom1', meaning that any subsequent input will be appended to 'textFieldFrom1'.
     */
    @FXML
    public void clickOnFrom1(){
        focusOnFrom1 = true;
    }

    /**
     * This method is called when the user clicks on the input decimal part TextField.
     * It sets the focus on 'textFieldFrom2', meaning that any subsequent input will be appended to 'textFieldFrom2'.
     */
    @FXML
    public void clickOnFrom2(){
        focusOnFrom1 = false;
    }

    /**
     * This method is called when the user clicks on a number button.
     * It retrieves the text from the clicked button and appends it to the TextField that currently has focus.
     *
     * @param event The ActionEvent object representing the button click event.
     */
    @FXML
    public void onNumber(ActionEvent event) {
        Button button = (Button) event.getSource();
        appendToDisplay(button.getText());
    }

    /**
     * This method is called when the user clicks on the delete button.
     * If the resetDisplay flag is set, it clears the target TextFields.
     * Otherwise, it deletes the last character from the TextField that currently has focus.
     */
    @FXML
    public void onDelete() {
        if (resetDisplay) {
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        } else if (focusOnFrom1 && !textFieldFrom1.getText().isEmpty()) {
            textFieldFrom1.setText(textFieldFrom1.getText(0, textFieldFrom1.getText().length() - 1));
        } else if (!focusOnFrom1 && !textFieldFrom2.getText().isEmpty()) {
            textFieldFrom2.setText(textFieldFrom2.getText(0, textFieldFrom2.getText().length() - 1));
        }
    }

    /**
     * This method is called when the user clicks on the clear button.
     * If the resetDisplay flag is set, it clears the target TextFields.
     * Otherwise, it clears the TextField that currently has focus.
     */
    @FXML
    public void onClear() {
        if (resetDisplay) {
            textFieldTo1.clear();
            textFieldTo2.clear();
            resetDisplay = false;
        } else if (focusOnFrom1) {
            textFieldFrom1.clear();
        } else {
            textFieldFrom2.clear();
        }
    }

    /**
     * Sets the display TextField.
     *
     * @param display The display TextField transmitted between modes.
     */
    @Override
    public void setDisplayTextField(TextField display) {
        this.display = display;
    }

    /**
     * Sets the expression TextField.
     *
     * @param expression The expression TextField transmitted between modes.
     */
    @Override
    public void setExpressionTextField(TextField expression) {
        this.expression = expression;
    }

    /**
     * Returns the preferred width of the ConversionsModeController's UI component.
     * This is used to properly size the component when it is displayed.
     *
     * @return The preferred width of the component.
     */
    @Override
    public float getPreferredWidth() {
        return 480;
    }

    /**
     * Returns the preferred height of the ConversionsModeController's UI component.
     * This is used to properly size the component when it is displayed.
     *
     * @return The preferred height of the component.
     */
    @Override
    public float getPreferredHeight() {
        return 640;
    }
}
