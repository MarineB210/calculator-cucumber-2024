package calculator.time;

import static org.junit.jupiter.api.Assertions.*;
import calculator.numbers.MyTime;
import org.junit.jupiter.api.*;

public class TestMyTime {

    private MyTime time;

    @BeforeEach
    void setUp() {
        time = new MyTime(2002, 7, 23, 15, 43, 0);
    }

    @Test
    public void testEquals(){
        assertEquals(new MyTime(2002, 7, 23, 15, 43, 0), time);
        assertNotEquals(new MyTime(2022, 8, 24, 16, 44, 1), time);
        assertEquals(time, time);
        assertNotEquals(time, 2002);
    }

    @Test
    public void testToString(){
        assertEquals("2002:07:23:15:43:00", time.toString());
    }

}
