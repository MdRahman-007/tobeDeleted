package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.SignupPage;
import org.testng.Assert;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */
public class SignupSD {

    private HomePage homePage = new HomePage();
    private SignupPage loginPage = new SignupPage();

    String Email=null;

    @Given("^I am on Registration page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(DriverFactory.getDriver().getTitle(), "Threely Starter Template", "Invalid Home Page");
    }

    @When("^I enter name as (.+) email as (.+) password as (.+)$")
    public void enterDataIntoTextFields(String userName,String emial, String password) {
    loginPage.enterUserName(userName);
    loginPage.enterEmail(emial);
    this.Email = emial;
    loginPage.enterPassword(password);
    }

    @And("^I click submit button$")
    public void clickSubmitButton() {
        loginPage.submitButton();
    }

    @Then("^I am signed-in as a new user$")
    public void verifySuccessfulLogIn() {
        Assert.assertTrue(homePage.isVisibleAccountLogo());
    }

    @Then("^I verify invalid email address$")
    public void invalidEmail() {
        System.out.println("     Testing email : "+ Email);
        try{Assert.assertTrue(loginPage.verifyInvalidLogIn());
    }catch(Exception e){
            System.out.println("    Invalid email address is registered. This should be a bug ! ");
        e.printStackTrace();}
    }




    }
