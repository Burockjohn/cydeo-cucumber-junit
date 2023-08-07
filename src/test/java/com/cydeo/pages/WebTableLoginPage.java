package com.cydeo.pages;

import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement inputLoginButton;

    /**
     * No parameters
     * When we call this method, it will directly log in using
     * <p>
     * Username = Test
     * Password = Tester
     */
    public void login() {
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.inputLoginButton.click();
    }

    /**
     * This method will accept two arguments and login.
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLoginButton.click();
    }

    /**
     * This method will log in using credentials from configuration.properties
     */
    public void loginWithConfig() {
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.password"));
        inputLoginButton.click();
    }

}
