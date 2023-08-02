package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(string));
    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeSteveJobsInTheMainHeader(String string) {
        Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());

        Assert.assertEquals(string, wikiSearchPage.mainHeader.getText());
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String string) {
        Assert.assertTrue(wikiSearchPage.imageHeader.isDisplayed());

        Assert.assertEquals(string, wikiSearchPage.imageHeader.getText());
    }
}
