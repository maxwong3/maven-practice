Feature: shoot interface

As a user 
I want to be able to shoot a planet 
so that I can see the planet being shot.

Background:
    Given a Death Star
    And a Planet with 10 hitpoints

Rule: When a planet is shot, Return value of call is "{planetDescription} planet was hit by the superlaser!" and Planet receives a damage of 100 hit points.

    Scenario: If I shoot a planet with 10 hitpoints, then return value of call is "Wimpy planet was hit by the superlaser!" and hitpoints of planet returns -90
    When I shoot a planet
    Then call return value is: "Wimpy planet was hit by the superlaser!"
    And planet hitpoints is: -90