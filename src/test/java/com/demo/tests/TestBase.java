package com.demo.tests;

import com.phonebook.fw.ApplicationMeneger;
import org.testng.annotations.*;

public class TestBase {

    protected ApplicationMeneger app = new ApplicationMeneger();

    @BeforeSuite
    public void setUP(){
        app.init();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }
}