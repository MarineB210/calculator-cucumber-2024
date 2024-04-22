package calculator.time;

import calculator.AppStarter;
import calculator.numbers.MyTime;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

@ExtendWith(ApplicationExtension.class)
public class TestTimeGui {
    private final AppStarter guiStarter = new AppStarter();
    @Start
    private void start(Stage stage) {
        guiStarter.start(stage);
    }

    @BeforeEach
    void setUp(FxRobot fxRobot){
        fxRobot.clickOn("#modeMenu");
        fxRobot.clickOn("#timeMode");
    }

    @Test
    void testClickNewButtons(FxRobot fxRobot){
        fxRobot.clickOn("#btnTimeZone");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("CET", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnColon");
        Assertions.assertEquals(":", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnAM");
        Assertions.assertEquals("AM", display.getText());
        fxRobot.clickOn("#btnClear");
        fxRobot.clickOn("#btnPM");
        Assertions.assertEquals("PM", display.getText());
    }

    @Test
    void testTime(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnTimeZone");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("16:34:25", display.getText());
    }

    @Test
    void testError(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn6");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("Error", display.getText());
    }

    @Test
    void testDateTime(FxRobot fxRobot){
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("2022:10:20:21:34:25", display.getText());
    }

    @Test
    void testTimeToDays(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnUnitDay");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("365.00 days", display.getText());
    }

    @Test
    void testTimeToHours(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnUnitHour");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("36.00 hours", display.getText());
    }

    @Test
    void testTimeToMinutes(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnUnitMin");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("720.00 minutes", display.getText());
    }

    @Test
    void testTimeToFull(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnUnitMin");
        fxRobot.clickOn("#btnUnitFull");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("12:00:00", display.getText());
    }

    @Test
    void testTimeToDecimal(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btnUnitDay");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("0.50 days", display.getText());
    }

    @Test
    void testTimeSum(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnAM");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("20:08:50", display.getText());
    }

    @Test
    void testTimeSubtract(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnPM");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("00:00:00", display.getText());
    }

    @Test
    void testTimeRetrieve(FxRobot fxRobot){
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnEquals");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnPlus");
        fxRobot.clickOn("#expression");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("09:00:00", display.getText());
    }

    @Test
    void testNotATime(FxRobot fxRobot){
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("NaT", display.getText());
    }

    @Test
    void testPrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("02:00:00", display.getText());
    }

    @Test
    void testCurrentTimePrefix(FxRobot fxRobot){
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnEquals");
        LocalDateTime currentTime = LocalDateTime.now();
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        LocalDateTime modifiedTime = currentTime.minusHours(10);
        MyTime now = new MyTime(modifiedTime.getYear(), modifiedTime.getMonthValue(),
                modifiedTime.getDayOfMonth(), modifiedTime.getHour(),
                modifiedTime.getMinute(), modifiedTime.getSecond());
        Assertions.assertEquals(now.toString(), display.getText());
    }

    @Test
    void testPostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnComma");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn8");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn3");
        fxRobot.clickOn("#btn4");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn2");
        fxRobot.clickOn("#btn5");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        Assertions.assertEquals("02:00:00", display.getText());
    }

    @Test
    void testCurrentTimePostfix(FxRobot fxRobot){
        fxRobot.clickOn("#btnOpenParenthesis");
        fxRobot.clickOn("#btn1");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnColon");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btn0");
        fxRobot.clickOn("#btnCloseParenthesis");
        fxRobot.clickOn("#btnMinus");
        fxRobot.clickOn("#btnEquals");
        LocalDateTime currentTime = LocalDateTime.now();
        TextField display = fxRobot.lookup("#display").queryAs(TextField.class);
        LocalDateTime modifiedTime = currentTime.minusHours(10);
        MyTime now = new MyTime(modifiedTime.getYear(), modifiedTime.getMonthValue(),
                modifiedTime.getDayOfMonth(), modifiedTime.getHour(),
                modifiedTime.getMinute(), modifiedTime.getSecond());
        Assertions.assertEquals(now.toString(), display.getText());
    }
}
