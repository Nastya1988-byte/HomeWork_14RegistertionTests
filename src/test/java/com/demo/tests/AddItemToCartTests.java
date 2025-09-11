package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        clickOnLoginLink();
        fillLoginForm(new RegisterUser()
                .setEmail("test345demoWeb#@mail.com")
                .setPassword("test345demoWeb#"));
        clickOnLoginButton();
    }

    @Test
    public void addToCardPositiveTest() {
        addToCard();
        Assert.assertTrue(isProductAdded());
    }

}


