package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;


class IsFriday{

    static String IsFriday(String today){
        return "Friday".equals(today) ? "TBC" : "nope";
    }
}


public class StepDefinitions {
    private String today;
    private String answer;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        answer = IsFriday.IsFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expected) {
        assertEquals(expected, answer);
    }
    @Given("today is Friday")
    public void today_is_Friday() {
        today = "Friday";
    }

    @Given("today is {string}")
    public void today_is(String string) {
        this.today = string;
    }


}
