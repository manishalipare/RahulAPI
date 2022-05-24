package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.PendingException;

public class MyStepDefinitions {

    @Given("^Open home page$")
    public void open_home_page() throws Throwable {
        System.out.println("Home page displayed");
    }

    @When("^Login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_valid_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page should be displayed \"([^\"]*)\"$")
    public void home_page_should_be_displayed_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}