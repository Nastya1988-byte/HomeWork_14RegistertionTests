package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        //click on Register link
        click(By.xpath("//a[text()='Register']"));

        //select Gender
//        driver.findElement(By.id("gender-female")).click();

        //First name enter
        type(By.id("FirstName"), "Anastasiia");

        //Last name enter
        type(By.id("LastName"), "Buch");

        //Email enter
        type(By.id("Email"), "test3demoWeb#"+i+"@mail.com");

        //Password enter
        type(By.id("Password"), "test3demoWeb#");

        //Confirm password enter
        type(By.id("ConfirmPassword"), "test3demoWeb#");

        //Click on Register button
        click(By.id("register-button"));

        //Click on Continue button
        click(By.xpath("//input[@class='button-1 register-continue-button']"));
    }

}
