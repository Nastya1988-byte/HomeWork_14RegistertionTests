package com.demo.tests;

import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
//        int i = (int)((System.currentTimeMillis()/1000)%3600);
        clickOnRegisterLink();
        fillRegisterLoginForm(new User()
                .setName("Anastasiia")
                .setLastName("Buch")
                .setEmail("test345demoWeb#@mail.com")
                .setPassword("test345demoWeb#")
                .setConfirmPassword("test345demoWeb#"));
        clickOnRegisterButton();
        clickOnContinueButton();
    }

}
