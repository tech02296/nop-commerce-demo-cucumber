package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I verify the register text is displayed")
    public void iVerifyTheRegisterTextIsDisplayed(String registerText) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), registerText, "I verify the register text is not displayed");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I get a error message for first name is required")
    public void iGetAErrorMessageForFirstNameIsRequired(String error) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequired(), error, "Error Message");
    }

    @And("I get error message for last name is required")
    public void iGetErrorMessageForLastNameIsRequired(String error) {
        Assert.assertEquals(new RegisterPage().getLastNameRequired(), error, "Error Message");
    }

    @And("I get error message for email is required")
    public void iGetErrorMessageForEmailIsRequired(String error) {
        Assert.assertEquals(new RegisterPage().getEmailFieldRequired(), error, "Error Message");
    }

    @And("I get error message for password is required")
    public void iGetErrorMessageForPasswordIsRequired(String error) {
        Assert.assertEquals(new RegisterPage().getPasswordRequired(), error, "Error Message");
    }

    @And("I get error message for confirm password is required")
    public void iGetErrorMessageForConfirmPasswordIsRequired(String error) {
        Assert.assertEquals(new RegisterPage().getConfirmPasswordRequired(), error, "Error Message");
    }

    @And("I click on gender female radio button")
    public void iClickOnGenderFemaleRadioButton() {
        new RegisterPage().selectGender("Female");
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I click on date tab from dropDown menu")
    public void iClickOnDateTabFromDropDownMenu(String text) {
        new RegisterPage().selectDay(text);
    }

    @And("I click on month tab from dropDown menu")
    public void iClickOnMonthTabFromDropDownMenu(String text) {
        new RegisterPage().selectMonth(text);
    }

    @And("I click on year tab from dropDown Menu")
    public void iClickOnYearTabFromDropDownMenu(String text) {
        new RegisterPage().selectYear(text);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @Then("I click on register Tab")
    public void iClickOnRegisterTab() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I verify registration successful")
    public void iVerifyRegistrationSuccessful(String regCompleteText) {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(), regCompleteText, "I verify the register text is displayed");
    }
}


