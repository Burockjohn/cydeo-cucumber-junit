package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage {

    public ViewAllOrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//td[1])[1]")
    public WebElement nameInFirstRow;
}
