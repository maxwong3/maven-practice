package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	private Value value;
	// TODO: Fill in!
	@Given("a Value")
	public void aValue() {
		value = new Value();
	}

	@When("I call incVal")
	public void incVal() {
		value.incVal();
	}

	@Then("the value is: {int}")
	public void getValue(int val) {
		assertEquals(value.getVal(), val);
	}
}	
