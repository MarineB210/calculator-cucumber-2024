package calculator.time;

import calculator.Calculator;
import calculator.TimeParser;
import calculator.numbers.MyTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeParser {

    // Basic infix tests
    @Test
    void testTime(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00",calculator);
        assertEquals(new MyTime(5,0,0),timeParser.evaluate());
    }

    @Test
    void testDate(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00",calculator);
        assertEquals(new MyTime(2024,4,17,5,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeFormat(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00 PM",calculator);
        assertEquals(new MyTime(17,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeZone(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00 CET+ 3",calculator);
        assertEquals(new MyTime(8,0,0),timeParser.evaluate());
    }

    @Test
    void testFullDateTime(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 PM CET- 3",calculator);
        assertEquals(new MyTime(2024,4,17,14,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeSum(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00 + 03:00:00",calculator);
        assertEquals(new MyTime(8,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeSum2(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:50:50 + 03:10:11",calculator);
        assertEquals(new MyTime(9,1,1),timeParser.evaluate());
    }

    @Test
    void testDateSum(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 + 0010:02:09:00:00:00",calculator);
        assertEquals(new MyTime(2034,5,27,5,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimeSum(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 + 05:00:00",calculator);
        assertEquals(new MyTime(2024,4,17,10,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimeSum2(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 + 23:00:00",calculator);
        assertEquals(new MyTime(2024,4,18,4,0,0),timeParser.evaluate());
    }

    @Test
    void testFullDateTimeSum(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 PM CET- 3 + 05:00:00 AM CET+4",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeSub(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00 - 03:00:00",calculator);
        assertEquals(new MyTime(2,0,0),timeParser.evaluate());
    }

    @Test
    void testTimeSub2(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:50:50 - 03:10:59",calculator);
        assertEquals(new MyTime(2,39,51),timeParser.evaluate());
    }

    @Test
    void testDateSub(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 - 0010:02:09:00:00:00",calculator);
        assertEquals(new MyTime(2014,3,9,5,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimeSub(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:10:00:00 - 05:00:00",calculator);
        assertEquals(new MyTime(2024,4,17,5,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimeSub2(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 - 23:00:00",calculator);
        assertEquals(new MyTime(2024,4,16,6,0,0),timeParser.evaluate());
    }

    @Test
    void testFullDateTimeSub(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 PM CET-3 - 06:00:00 AM CET+4",calculator);
        assertEquals(new MyTime(2024,4,17,4,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedTime(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("05:00:00 + (03:00:00 - 01:00:00)",calculator);
        assertEquals(new MyTime(7,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedDate(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 + (0010:02:09:00:00:00 - 0001:01:01:00:00:00)",calculator);
        assertEquals(new MyTime(2033,5,26,5,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedDateTime(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 + (05:00:00 - 01:00:00)",calculator);
        assertEquals(new MyTime(2024,4,17,9,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedFullDateTime(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("2024:04:17:05:00:00 PM CET-3 + (06:00:00 AM CET+4 - 01:00:00)",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

    //Basic prefix tests
    @Test
    void testTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (05:00:00, 03:00:00)",calculator);
        assertEquals(new MyTime(8,0,0),timeParser.evaluate());
    }

    @Test
    void testCurrentTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (05:00:00)",calculator);
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime modifiedTime = currentTime.plusHours(5);
        MyTime now = new MyTime(modifiedTime.getYear(), modifiedTime.getMonthValue(),
                modifiedTime.getDayOfMonth(), modifiedTime.getHour(),
                modifiedTime.getMinute(), modifiedTime.getSecond());
        assertEquals(now,timeParser.evaluate());
    }

    @Test
    void testDatePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (2024:04:17:05:00:00, 0010:02:09:00:00:00)",calculator);
        assertEquals(new MyTime(2034,5,27,5,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (2024:04:17:05:00:00, 05:00:00)",calculator);
        assertEquals(new MyTime(2024,4,17,10,0,0),timeParser.evaluate());
    }

    @Test
    void testFullDateTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (2024:04:17:05:00:00 PM CET-3, 05:00:00 AM CET+4)",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (05:00:00, - (03:00:00, 01:00:00))",calculator);
        assertEquals(new MyTime(7,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedFullDateTimePrefix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("+ (2024:04:17:05:00:00 PM CET-3, - (06:00:00 AM CET+4, 01:00:00))",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

    //Basic postfix tests

    @Test
    void testTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(05:00:00, 03:00:00)+",calculator);
        assertEquals(new MyTime(8,0,0),timeParser.evaluate());
    }

    @Test
    void testCurrentTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(05:00:00)-",calculator);
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime modifiedTime = currentTime.minusHours(5);
        MyTime now = new MyTime(modifiedTime.getYear(), modifiedTime.getMonthValue(),
                modifiedTime.getDayOfMonth(), modifiedTime.getHour(),
                modifiedTime.getMinute(), modifiedTime.getSecond());
        assertEquals(now,timeParser.evaluate());
    }

    @Test
    void testDatePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(2024:04:17:05:00:00, 0010:02:09:00:00:00)+",calculator);
        assertEquals(new MyTime(2034,5,27,5,0,0),timeParser.evaluate());
    }

    @Test
    void testDateTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(2024:04:17:05:00:00, 05:00:00)+",calculator);
        assertEquals(new MyTime(2024,4,17,10,0,0),timeParser.evaluate());
    }

    @Test
    void testFullDateTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(2024:04:17:05:00:00 PM CET-3, 05:00:00 AM CET+4)+",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(05:00:00, (03:00:00, 01:00:00)-)+",calculator);
        assertEquals(new MyTime(7,0,0),timeParser.evaluate());
    }

    @Test
    void testNestedFullDateTimePostfix(){
        Calculator calculator = new Calculator();
        TimeParser timeParser = new TimeParser("(2024:04:17:05:00:00 PM CET-3, (06:00:00 AM CET+4, 01:00:00)-)+",calculator);
        assertEquals(new MyTime(2024,4,17,23,0,0),timeParser.evaluate());
    }

}
