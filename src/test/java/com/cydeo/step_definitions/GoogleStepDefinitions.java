package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    @When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String string) {
        googleSearchPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        googleSearchPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!", expectedTitle, actualTitle);
    }

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @Then("user sees {word} in the google title")
    public void user_sees_apple_in_the_google_title(String anything) {
        String expectedTitle = anything+" - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        //Junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("Title is not as expected!", expectedTitle, actualTitle);
    }

    @When("user is on Google search page")
    public void user_is_google_search_page() {

        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
