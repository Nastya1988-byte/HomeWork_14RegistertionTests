package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHalper extends BaseHalper{

    public HomePageHalper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePagePresent(){
        return isElementPresent(By.className("header-logo"));
    }
}
