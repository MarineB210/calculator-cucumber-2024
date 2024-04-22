package calculator.bool;

import calculator.AppStarter;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.w3c.dom.Text;

@ExtendWith(ApplicationExtension.class)
class TestGUIBool {

    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }


    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#booleanMode");
    }

    @Test
    void testClick(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testOr(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnOr");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testAnd(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnAnd");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testNot(FxRobot fxRobot){
        fxRobot.clickOn("#btnNot");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testXor(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnXor");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testImpl(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnImply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testEq(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquiv");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testMultipleOperations(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnImply");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnOr");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnImply");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testPostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnAnd");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testMultiplePostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnAnd");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnOr");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testprefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOr");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testMultiplePrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnAnd");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btnNot");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn(("#btnComma"));
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testDelete(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.push(KeyCode.BACK_SPACE);
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("1", display.getText());
    }

    @Test
    void testRetrieve(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnAnd");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnOr");
        fxRobot.clickOn("#expression");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0", display.getText());
    }

    @Test
    void testClear(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnClear");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
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
        fxRobot.clickOn("#zoomOut");
        fxRobot.clickOn("#zoomMenu");
        fxRobot.clickOn("#zoomIn");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals(68, display.getFont().getSize());
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
}
