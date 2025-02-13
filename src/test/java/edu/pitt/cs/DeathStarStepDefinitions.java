package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class DeathStarStepDefinitions {
    DeathStar deathStar;
    Planet planet;
    String returnValue = "";
    @Given("a Death Star")
    public void aDeathStar() {
        deathStar = new DeathStar();
    }

    @Given("a Planet with {int} hitpoints")
    public void aPlanet(int hitpoints) {
        planet = new Planet(hitpoints);
    }

    @When("I shoot a planet")
    public void shoot() {
        returnValue = deathStar.shoot(planet);
    }

    @Then("call return value is: {string}")
    public void shootReturn(String returnValue) {
        assertEquals(returnValue, this.returnValue);
    }

    @Then("planet hitpoints is: {int}")
    public void planetHitpoints(int hp) {
        assertEquals(hp, planet.getHitPoints());
    }
}
