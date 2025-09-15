package com.phonebook.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationMeneger {

    WebDriver driver;
    UserRegisterHelper userRegister;
    LoginHelper userLogin;
    AddToCardHelper add;
    HomePageHelper home;
    String browser;

    public ApplicationMeneger() {
        this.browser=browser;
    }


    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        userRegister = new UserRegisterHelper(driver);
        userLogin = new LoginHelper(driver);
        add = new AddToCardHelper(driver);
        home = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserRegisterHelper getUserRegister() {
        return userRegister;
    }

    public LoginHelper getUserLogin() {
        return userLogin;
    }

    public AddToCardHelper getAdd() {
        return add;
    }

    public HomePageHelper getHome() {
        return home;
    }
}
