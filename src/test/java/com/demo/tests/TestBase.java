package com.demo.tests;

import com.phonebook.fw.ApplicationMeneger;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.*;

public class TestBase {

    protected ApplicationMeneger app = new ApplicationMeneger(System
            .getProperty("browser", Browser.CHROME.browserName()));

    @BeforeMethod
    public void setUP(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }
}