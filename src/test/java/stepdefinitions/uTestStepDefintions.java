package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class uTestStepDefintions {
    @Before
    public void setStagen() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than Alex wants to learn automation at the academy uTest$")
    public void thanAlexWantsToLearnAutomationAtTheAcademyUTest() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^he search course(.*) on the uTest academy platform$")
    public void heSearchForTheBasicTestsCourseOnTheUTestAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he find the course (.*)$")
    public void heFindTheCourseCalledBasicTests(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));

    }

}
