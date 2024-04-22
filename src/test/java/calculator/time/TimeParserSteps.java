package calculator.time;

import calculator.Calculator;
import calculator.TimeParser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeParserSteps {
    private Calculator c;
    private TimeParser inputParser;
    @Given("I have a time {string}")
    public void givenIHaveATime(String s) {
        c = new Calculator();
        inputParser = new TimeParser(s, c);
    }
    @Given("I have a date and time {string}")
    public void givenIHaveADateAndTime(String s) {
        c = new Calculator();
        inputParser = new TimeParser(s, c);
    }

    @Given("I have a time expression {string}")
    public void givenIHaveATimeExpression(String s) {
        c = new Calculator();
        inputParser = new TimeParser(s, c);
    }

    @Then("I should get a time {int} : {int} : {int}")
    public void thenIShouldGetATime(int hours, int minutes, int seconds) {
        assertEquals(LocalDateTime.of(0,1,1,hours,minutes, seconds),
                inputParser.evaluate().getTime());
    }

    @Then("I should get a date and time  {int} : {int} : {int} : {int} : {int} : {int}")
    public void thenIShouldGetADateAndTime(int year, int month, int day, int hour, int minute, int second) {
        assertEquals(LocalDateTime.of(year,month,day,hour,minute, second),
                inputParser.evaluate().getTime());
    }
}
