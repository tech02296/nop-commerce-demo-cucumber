package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should not logged in with invalid credentials")
    public void iShouldNotLoggedInWithInvalidCredentials() {
        new LoginPage().getErrorMessage();
    }

    @Then("I verify the log out link is displayed")
    public void iVerifyTheLogOutLinkIsDisplayed() {
        new HomePage().isLogOutLinkDisplayed();
    }

    @And("I click on log out link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("I verify the login in is displayed")
    public void iVerifyTheLoginInIsDisplayed() {
        new HomePage().isLogInLinkDisplayed();
    }
}
