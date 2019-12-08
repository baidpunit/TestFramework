package com.cucumber.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {


	@Then("User clicks on the {string} of the {string} Page.")
	public void user_clicks_on_the_of_the_Page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("The User navigates to the application.")
	public void the_User_navigates_to_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Pass");
	}
}
