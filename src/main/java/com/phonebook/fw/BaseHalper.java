package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHalper {
    WebDriver driver;

    public BaseHalper(WebDriver driver) {
        this.driver=driver;
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
