package calculator.ComplexNumber;

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
class TestComplexGui {

    private final AppStarter guiStarter = new AppStarter();

    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot) {
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#complexMode");
    }

    @Test
    void testSumComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5 + 2i", display.getText());
    }

    @Test
    void testMinusComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3 - i", display.getText());
    }

    @Test
    void testMultiplyComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("56 - 8i", display.getText());
    }

    @Test
    void testDivideComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testModulusComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btnModulus");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnModulus");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5", display.getText());
    }

    @Test
    void testSqrt(FxRobot fxRobot) {
        fxRobot.clickOn("#btnSqrt");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("3", display.getText());
    }

    @Test
    void testIntoCartesian(FxRobot fxRobot) {
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomOut");
        fxRobot.clickOn("#btnCartesianForm");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnE");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1 + i", display.getText());
    }


    @Test
    void testIntoPolar(FxRobot fxRobot) {
        fxRobot.clickOn("#btnPolarForm");
        fxRobot.clickOn("#btnSqrt");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnSqrt");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2 * cis(45)", display.getText());
    }

    @Test
    void testIntoE(FxRobot fxRobot) {
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnEForm");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnMultiply");
        fxRobot.clickOn("#btnCis");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2 * e(i*45)", display.getText());
    }

    @Test
    void testComplexNumberPrefix(FxRobot fxRobot) {
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5 + i", display.getText());
    }

    @Test
    void testComplexNumberPostfix(FxRobot fxRobot) {
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("5 + i", display.getText());
    }


    @Test
    void testErrorComplex(FxRobot fxRobot) {
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn7");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnDivide");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnI");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("NaN", display.getText());
    }


    @Test
    void testInvalidEnter(FxRobot fxRobot) {
        fxRobot.clickOn("#btnSqrt");
        fxRobot.clickOn("#btn9");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("Error", display.getText());
    }

    @Test
    void testXCommaAfterEqual(FxRobot fxRobot) {
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnComma");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0,", display.getText());
    }

    @Test
    void testClearAfterEqual(FxRobot fxRobot) {
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnClear");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("", display.getText());
    }

}
