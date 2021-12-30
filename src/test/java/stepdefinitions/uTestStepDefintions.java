package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.uTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.Search;
import java.util.List;
import tasks.Login;

public class uTestStepDefintions {
    @Before
    public void setStagen() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than Alex wants to learn automation at the academy uTest$")
    public void thanAlexWantsToLearnAutomationAtTheAcademyUTest() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));

    }

    @When("^he search courseon the uTest academy platform$")
    public void heSearchForTheBasicTestsCourseOnTheUTestAcademyPlatform (List<uTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(uTestData.get(0).getStrCourse()));
    }

    @Then("^he find the course $")
    public void heFindTheCourseCalledBasicTests (List<uTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(uTestData.get(0).getStrCourse())));

    }

}
