package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.PendingException;


public class MyStepDefinion2 {

    @Given("^Open url$")
    public void open_url() throws Throwable {
        System.out.println("Login page");
    }

    @When("^Enter (.+) and (.+)$")
    public void enter_and(String id, String password) throws Throwable {
       System.out.println(id);
       System.out.println(password);
    }

    @Then("^Home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
        System.out.println("HomePage");
    }

}