package com.demo.tests;

import com.phonebook.fw.ApplicationMeneger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicationMeneger app = new ApplicationMeneger();

    @BeforeMethod
    public void setUP(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }
}
