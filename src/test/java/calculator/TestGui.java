package calculator;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import java.util.Optional;

@ExtendWith(ApplicationExtension.class)
class TestGui {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @Test
    void testClick(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-", display.getText());
        fxRobot.clickOn("#btnEquals");
        Assertions.assertEquals("Error", display.getText());
    }

    @Test
    void testOnlyComma(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnComma");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0,", display.getText());
    }

    @Test
    void testSum(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5", display.getText());
        fxRobot.clickOn("#btnEquals");
        Assertions.assertEquals("5", display.getText());
    }

    @Test
    void testMinus(FxRobot fxRobot){
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testMultiply(FxRobot fxRobot){
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("42", display.getText());
    }

    @Test
    void testDivide(FxRobot fxRobot){
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("4", display.getText());
    }

    @Test
    void testMultipleOperations(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("7", display.getText());
    }

    @Test
    void testNegative(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-3", display.getText());
    }

    @Test
    void testDivideBy0(FxRobot fxRobot){
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("NaN", display.getText());
    }

    @Test
    void testPostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2", display.getText());
    }

    @Test
    void testMultiplePostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("9", display.getText());
    }

    @Test
    void testPrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2", display.getText());
    }

    @Test
    void testMultiplePrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn(("#btnComma"));
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("9", display.getText());
    }

    @Test
    void testDelete(FxRobot fxRobot){
        Assertions.assertDoesNotThrow(() -> fxRobot.push(KeyCode.BACK_SPACE));
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn3");
        fxRobot.push(KeyCode.BACK_SPACE);
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("12", display.getText());
    }

    @Test
    void testHandleDisplayFieldClick(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.push(KeyCode.TAB);
        fxRobot.push(KeyCode.TAB);
        fxRobot.push(KeyCode.TAB);
        fxRobot.push(KeyCode.BACK_SPACE);
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
        fxRobot.clickOn("#display");
        fxRobot.push(KeyCode.BACK_SPACE);
        Assertions.assertEquals("", display.getText());
    }

    @Test
    void testRetrieve(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#expression");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
        fxRobot.clickOn("#expression");
        Assertions.assertEquals("1", display.getText());
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#expression");
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testClear(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnClear");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("", display.getText());
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnClear");
        Assertions.assertEquals("", display.getText());
    }

    @Test
    void testZoomOut(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomOut");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals(70, display.getFont().getSize());
    }

    @Test
    void testZoomIn(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomOut");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomOut");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomIn");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals(70, display.getFont().getSize());
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomIn");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomIn");
        display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals(72, display.getFont().getSize());
    }

    @Test
    void testZoomDefault(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomOut");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomDefault");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals(72, display.getFont().getSize());
    }

    @Test
    void testConversionsModeChange(FxRobot fxRobot){
        Optional<Button> btnCommaOptional = fxRobot.lookup("#btnComma").tryQuery();
        Assertions.assertTrue(btnCommaOptional.isPresent());
        Optional<Button> btnConvertOptional = fxRobot.lookup("#btnConvert").tryQuery();
        Assertions.assertFalse(btnConvertOptional.isPresent());

        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#conversionsMode");
        btnCommaOptional = fxRobot.lookup("#btnComma").tryQuery();
        Assertions.assertFalse(btnCommaOptional.isPresent());
        btnConvertOptional = fxRobot.lookup("#btnConvert").tryQuery();
        Assertions.assertTrue(btnConvertOptional.isPresent());
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#conversionsMode");
        btnConvertOptional = fxRobot.lookup("#btnConvert").tryQuery();
        Assertions.assertTrue(btnConvertOptional.isPresent());

        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#standardMode");
        btnConvertOptional = fxRobot.lookup("#btnConvert").tryQuery();
        Assertions.assertFalse(btnConvertOptional.isPresent());
    }

    @Test
    void testSwitchingBetweenModes(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#standardMode");
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#booleanMode");
        Optional<Button> btnXorOptional = fxRobot.lookup("#btnXor").tryQuery();
        Assertions.assertTrue(btnXorOptional.isPresent());
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#booleanMode");
        btnXorOptional = fxRobot.lookup("#btnXor").tryQuery();
        Assertions.assertTrue(btnXorOptional.isPresent());

        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#timeMode");
        Optional<Button> btnUnitFullOptional = fxRobot.lookup("#btnUnitFull").tryQuery();
        Assertions.assertTrue(btnUnitFullOptional.isPresent());
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#timeMode");
        btnUnitFullOptional = fxRobot.lookup("#btnUnitFull").tryQuery();
        Assertions.assertTrue(btnUnitFullOptional.isPresent());

        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#complexMode");
        Optional<Button> btnIOptional = fxRobot.lookup("#btnI").tryQuery();
        Assertions.assertTrue(btnIOptional.isPresent());
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#complexMode");
        btnIOptional = fxRobot.lookup("#btnI").tryQuery();
        Assertions.assertTrue(btnIOptional.isPresent());
    }
}
