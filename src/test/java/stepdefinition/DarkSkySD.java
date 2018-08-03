package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DarkskyPage;

/**
 * Created by mdrahman on 8/1/18.
 * Spring 2018
 */
public class DarkSkySD {

        DarkskyPage darkSkyPage = new DarkskyPage();

        @Given("^I am on Darksky home page$")
        public void iamOnHomePage(){

            darkSkyPage.verifyHomePage();
        }

        @When("^I expand todays timeline$")
        public void expandTodaysTimelines(){
            darkSkyPage.expandTodaysTimeline();
        }

        @When("^I click on Time machine$")
        public void clickOnTimeMachine(){
            darkSkyPage.clickOnTimeMachine();
        }


        @Then("^I verify timeline is displayed with two hours incremented$")
        public void verifyTwoHoursIncrement(){
            darkSkyPage.verify2hourIncrement();
        }

        @Then("^I verify lowest and highest temp is displayed correctly$")
        public void verifyLowestHighestTemp(){
            darkSkyPage.verifyLowestHighestTemp();
        }

        @Then("^I verify date is selected to todays date$")
        public void verifyTodaysDate(){
            darkSkyPage.verifyTodaysDate();

        }

    }


