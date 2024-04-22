package calculator.time;

import calculator.numbers.MyNotATime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyNotATime {
    private final MyNotATime nat = new MyNotATime();

    @Test
    void testToString() {
        assertEquals("NaT", nat.toString());
    }
}
