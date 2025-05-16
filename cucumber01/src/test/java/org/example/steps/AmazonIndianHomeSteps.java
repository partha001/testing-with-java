package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonIndianHomeSteps {

    @Given("I am on the Amazon India home page")
    public void i_am_on_the_amazon_india_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("am on amazon indian home page");
    }

    @When("I click on the Fresh menu")
    public void i_click_on_the_fresh_menu() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("i click on amazon india fresh menu");
    }

    @Then("It should show me groceries and food")
    public void it_should_show_me_groceries_and_food() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("i navigate to amazon india fresh page");
    }

}
