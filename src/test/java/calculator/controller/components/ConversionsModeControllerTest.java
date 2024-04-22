package calculator.controller.components;

import calculator.AppStarter;
import calculator.conversions.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The ConversionsModeControllerTest class is responsible for testing the GUI of the Conversions Mode.
 * It includes tests for button clicks, input deletion, input clearing, unit conversion, unit change, and more.
 * This class uses the TestFX library for JavaFX UI testing.
 */
@ExtendWith(ApplicationExtension.class)
class ConversionsModeControllerTest {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#conversionsMode");
    }

    @Test
    void testClick(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        assertEquals("1", textFieldFrom1.getText());
    }

    @Test
    void testClickDecimal(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn6");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        assertEquals("6", textFieldFrom2.getText());
    }

    @Test
    void testClickInteger(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#textFieldFrom1");
        fxRobot.clickOn("#btn2");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        assertEquals("2", textFieldFrom1.getText());
    }

    @Test
    void testDelete(FxRobot fxRobot){
        Assertions.assertDoesNotThrow(() -> fxRobot.clickOn("#btnDelete"));
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        assertEquals("3", textFieldFrom1.getText());

        fxRobot.clickOn("#textFieldFrom2");
        Assertions.assertDoesNotThrow(() -> fxRobot.clickOn("#btnDelete"));
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        assertEquals("4", textFieldFrom2.getText());

        fxRobot.clickOn("#btnConvert");
        fxRobot.clickOn("#btnDelete");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("", textFieldTo2.getText());
    }

    @Test
    void testClear(FxRobot fxRobot){
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnClear");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        assertEquals("", textFieldFrom1.getText());

        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnClear");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        assertEquals("", textFieldFrom2.getText());

        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnConvert");
        fxRobot.clickOn("#btnClear");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("", textFieldTo2.getText());
    }

    @Test
    void testConvertInteger(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("2600", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("0", textFieldTo2.getText());
    }

    @Test
    void testConvertDecimal(FxRobot fxRobot){
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("80", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("0", textFieldTo2.getText());
    }

    @Test
    void testConvert(FxRobot fxRobot){
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("", textFieldTo1.getText());
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnConvert");
        textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("1369", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("2", textFieldTo2.getText());
    }

    @Test
    void testEraseOutputAfterConvert(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnConvert");
        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("100", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("0", textFieldTo2.getText());
        fxRobot.clickOn("#btn2");
        assertEquals("", textFieldTo1.getText());
        assertEquals("", textFieldTo2.getText());

        fxRobot.clickOn("#btnConvert");
        assertEquals("200", textFieldTo1.getText());
        assertEquals("0", textFieldTo2.getText());
        ComboBox comboBoxToUnit = fxRobot.lookup("#comboBoxToUnit").queryAs(ComboBox.class);
        fxRobot.interact(() -> comboBoxToUnit.getSelectionModel().select(0));
        fxRobot.clickOn("#btnConvert");
        assertEquals("", textFieldTo1.getText());
        assertEquals("", textFieldTo2.getText());
    }

    @Test
    void testUnitChange(FxRobot fxRobot){
        ComboBox comboBox = fxRobot.lookup("#unitTypeComboBox").queryAs(ComboBox.class);
        assertEquals(UnitType.LENGTH, comboBox.getValue());
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Time");
        assertEquals(UnitType.TIME, comboBox.getValue());
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Time");
        assertEquals(UnitType.TIME, comboBox.getValue());
    }

    @Test
    void testFromToUnitChange(FxRobot fxRobot){
        ComboBox<Unit> comboBoxFromUnit = fxRobot.lookup("#comboBoxFromUnit").queryAs(ComboBox.class);
        ComboBox<Unit> comboBoxToUnit = fxRobot.lookup("#comboBoxToUnit").queryAs(ComboBox.class);
        assertEquals(LengthUnit.METER, comboBoxFromUnit.getValue());
        assertEquals(LengthUnit.CENTIMETER, comboBoxToUnit.getValue());

        fxRobot.clickOn("#comboBoxFromUnit");
        fxRobot.clickOn("Inch");
        fxRobot.clickOn("#comboBoxToUnit");
        fxRobot.clickOn("Foot");

        assertEquals(LengthUnit.INCH, comboBoxFromUnit.getValue());
        assertEquals(LengthUnit.FOOT, comboBoxToUnit.getValue());

        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Volume");

        assertEquals(VolumeUnit.CUBICMETER, comboBoxFromUnit.getValue());
        assertEquals(VolumeUnit.LITER, comboBoxToUnit.getValue());
    }

    @Test
    void testConvertAfterUnitChange(FxRobot fxRobot){
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Pressure");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnConvert");

        TextField textFieldTo1 = fxRobot.lookup("#textFieldTo1").queryAs(TextField.class);
        assertEquals("6", textFieldTo1.getText());
        TextField textFieldTo2 = fxRobot.lookup("#textFieldTo2").queryAs(TextField.class);
        assertEquals("39", textFieldTo2.getText());
    }

    @Test
    void testMoreThanTenCharacters(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn1");
        TextField textFieldFrom1 = fxRobot.lookup("#textFieldFrom1").queryAs(TextField.class);
        assertEquals("1234567890", textFieldFrom1.getText());
        fxRobot.clickOn("#textFieldFrom2");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        TextField textFieldFrom2 = fxRobot.lookup("#textFieldFrom2").queryAs(TextField.class);
        assertEquals("9876543210", textFieldFrom2.getText());
    }

    @Test
    void testClickOnUnitTypes(FxRobot fxRobot) {
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Mass and Weight");
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Currency");
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Power");
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Speed");
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Area");
        fxRobot.clickOn("#unitTypeComboBox");
        fxRobot.clickOn("Energy");
        fxRobot.clickOn("#unitTypeComboBox");
        for (int i = 0; i < 3; i++) {
            fxRobot.type(KeyCode.DOWN);
        }
        fxRobot.clickOn("Temperature");
        ComboBox comboBoxFromUnit = fxRobot.lookup("#comboBoxFromUnit").queryAs(ComboBox.class);
        assertEquals(TemperatureUnit.CELSIUS, comboBoxFromUnit.getValue());
    }

    @Test
    void testUnitTypeComboBoxStringConverter(FxRobot fxRobot) {
        ComboBox<UnitType> unitTypeComboBox = fxRobot.lookup("#unitTypeComboBox").queryAs(ComboBox.class);
        StringConverter<UnitType> converter = unitTypeComboBox.getConverter();
        for (UnitType unitType : UnitType.values()) {
            String expectedName = unitType.getName();
            String actualName = converter.toString(unitType);
            assertEquals(expectedName, actualName);
        }
        assertNull(converter.toString(null));
        assertNull(converter.fromString("Any string"));
    }

    @Test
    void testUnitComboBoxStringConverter(FxRobot fxRobot) {
        ComboBox<Unit> comboBoxToUnit = fxRobot.lookup("#comboBoxToUnit").queryAs(ComboBox.class);
        StringConverter<Unit> converter = comboBoxToUnit.getConverter();

        for (LengthUnit unit : LengthUnit.values()) {
            String expectedName = unit.getName();
            String actualName = converter.toString(unit);
            assertEquals(expectedName, actualName);
        }
        assertNull(converter.toString(null));
        assertNull(converter.fromString("Any string"));
    }
}