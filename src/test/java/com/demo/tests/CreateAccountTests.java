package com.demo.tests;

import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUserRegister().isRegisterLinkPresent()){
            app.getUserRegister().clickOnLogOutButton();
        }
    }
    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {
//        int i = (int)((System.currentTimeMillis()/1000)%3600);
        app.getUserRegister().clickOnRegisterLink();
        app.getUserRegister().fillRegisterLoginForm(new User()
                .setName("Anastasiia")
                .setLastName("Buch")
                .setEmail("test345demoWeb#@mail.com")
                .setPassword("test345demoWeb#")
                .setConfirmPassword("test345demoWeb#"));
        app.getUserRegister().clickOnRegisterButton();
        app.getUserRegister().clickOnContinueButton();
    }

    @Test
    public void newUserRegistrationNegativeTest(){
        app.getUserRegister().clickOnRegisterLink();
        app.getUserRegister().fillRegisterLoginForm(new User()
                .setName("Anastasiia")
                .setLastName("Buch")
                .setEmail("test345demoWeb#@mail.com")
                .setPassword("test345demoWeb#")
                .setConfirmPassword("test345demoWeb#"));
        app.getUserRegister().clickOnRegisterButton();
        Assert.assertTrue(app.getUserRegister().isErroeMessagePresent());
    }
}
