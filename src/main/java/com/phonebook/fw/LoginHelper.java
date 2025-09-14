package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends BaseHalper{

    public LoginHelper(WebDriver driver) {
        super(driver);
    }

    public void fillLoginForm(RegisterUser registerUser){
        type(By.id("Email"), registerUser.getEmail());
        type(By.id("Password"), registerUser.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@value='Log in']"));
    }
}
