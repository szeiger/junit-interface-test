package com.novocode.cucumber_test;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.ScenarioResult;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class RpnCalculatorStepdefs {
    private RpnCalculator calc;

    @Given("^a calculator I just turned on$")
    public void a_calculator_I_just_turned_on() {
        calc = new RpnCalculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void adding(int arg1, int arg2) {
        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Given("^I press (.+)$")
    public void I_press(String what) {
        calc.push(what);
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.value());
    }

    @Before({"~@foo"})
    public void before() {
        System.out.println("Runs before scenarios *not* tagged with @foo");
    }

    @After
    public void after(ScenarioResult result) {
        result.write("HELLLLOO");
    }

    @Given("^the previous entries:$")
    public void thePreviousEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            calc.push(entry.first);
            calc.push(entry.second);
            calc.push(entry.operation);
        }
    }

    public class Entry {
        Integer first;
        Integer second;
        String operation;
    }
}