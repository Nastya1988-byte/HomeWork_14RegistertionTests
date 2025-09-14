package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegisterHelper extends BaseHalper{


    public UserRegisterHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[text()='Register']"));
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void clickOnContinueButton() {
        click(By.xpath("//input[@class='button-1 register-continue-button']"));
    }

    public void fillRegisterLoginForm(User user) {
        type(By.id("FirstName"), user.getName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getConfirmPassword());
    }
}
