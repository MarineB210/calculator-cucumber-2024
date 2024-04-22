package calculator.rational;

import calculator.AppStarter;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
public class TestRationalGui {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#rationalMode");
    }

    @Test
    void testSingleInteger(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-3", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display3.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display4 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display4.getText());
    }

    @Test
    void testSingleRational(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-3÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-3÷2", display3.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display4 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display4.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display5 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display5.getText());
    }

    @Test
    void testPlusSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2", display3.getText());
    }

    @Test
    void testRationalPlusIntegerSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷2", display3.getText());
    }

    @Test
    void testMinusSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display3.getText());
    }

    @Test
    void testRationalMinusIntegerSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display3.getText());
    }

    @Test
    void testTimesSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷4", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷4", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷4", display3.getText());
    }

    @Test
    void testTimesByZero(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display1.getText());
    }

    @Test
    void testRationalTimesIntegerSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display3.getText());
    }

    @Test
    void testDivideSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display3.getText());
    }

    @Test
    void testDivideByZero(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("NaN", display1.getText());
    }
    
    @Test
    void testRationalDivideIntegerSimple(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1÷2", display3.getText());
    }

    @Test
    void testPlusMinus(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display3.getText());
    }

    @Test
    void testTimesDivide(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display1.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display2.getText());

        fxRobot.clickOn("#btnClear");

        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3÷2", display3.getText());
    }

    @Test
    void testParentheses(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");
        // (3÷2 + 1÷2) * 1÷2
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display1.getText());

        fxRobot.clickOn("#btnClear");
        // * (+ (3÷2, 1÷2), 1÷2)
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display2.getText());

        fxRobot.clickOn("#btnClear");
        // ((3÷2, 1÷2) +, 1÷2) *
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display3.getText());
    }

    @Test
    void testComplexExpression(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");
        // 3÷2 + 1÷2 * 1÷2 - 1÷2
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display1 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷4", display1.getText());

        fxRobot.clickOn("#btnClear");
        // - (+ (3÷2, * (1÷2, 1÷2)), 1÷2)
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display2 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷4", display2.getText());

        fxRobot.clickOn("#btnClear");
        // ((3÷2, (1÷2, 1÷2) *) +, 1÷2) -
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display3 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5÷4", display3.getText());


        fxRobot.clickOn("#btnClear");
        // 3÷2 + 1÷2 * 1÷2 - 1÷2 + 1÷2
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnEquals");
        TextField display4 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("7÷4", display4.getText());

        fxRobot.clickOn("#btnClear");
        // + (- (+ (3÷2, * (1÷2, 1÷2)), 1÷2), 1÷2)
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display5 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("7÷4", display5.getText());

        fxRobot.clickOn("#btnClear");
        // ((((1÷2, 1÷2) *, 3÷2) +,1÷2) -, 1÷2) +
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnEquals");
        TextField display6 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("7÷4", display6.getText());


        fxRobot.clickOn("#btnClear");
        // -(3÷2 + 1÷2 * 1÷2 - 1÷2)
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display7 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-5÷4", display7.getText());

        fxRobot.clickOn("#btnClear");
        // -(- (+ (3÷2, * (1÷2, 1÷2)), 1÷2))
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display8 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-5÷4", display8.getText());

        fxRobot.clickOn("#btnClear");
        // (((3÷2, (1÷2, 1÷2) *) +, 1÷2) -)-
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnFraction");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display9 = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("-5÷4", display9.getText());
    }
}
