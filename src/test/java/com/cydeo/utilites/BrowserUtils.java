package com.cydeo.utilites;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {

    /*

    this method will accept int (in seconds) and execute Thread.sleep

    */

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        /*

        This method accepts 3 arguments.
        Arg1: webdriver
        Arg2: expectedInUrl : for verify if the url contains given String.
            - If condition matches, will break loop.
        Arg3: expectedInTitle to be compared against actualTitle

        */

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    public static void verifyTitle(String expectedTitle) {

        //This method accepts a String "expectedTitle" and Asserts if it is true

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }


    public static void waitForInvisibilityOf(WebElement webElement) {
        //Creating a utility method for ExplicitWait, so we don't have to repeat the lines

        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

}
