package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    @Test
    public void isHomePagePresentTest(){
        Assert.assertTrue(app.getHome().isHomePagePresent());
    }

}
