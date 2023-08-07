package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage{

    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zipCode;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expiryDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

}
