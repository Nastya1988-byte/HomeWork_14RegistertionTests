package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        //click on Register link
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //select Gender
        driver.findElement(By.id("gender-female")).click();
        //First name enter
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Anastasiia");

        //Last name enter
        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Buch");

        //Email enter
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("test3demoWeb#@mail.com");

        //Password enter
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test3demoWeb#");

        //Confirm password enter
        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test3demoWeb#");

        //Click on Register button
        driver.findElement(By.id("register-button")).click();

        //Click on Continue button
        driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();


    }
}
