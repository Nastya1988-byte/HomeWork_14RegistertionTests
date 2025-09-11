package com.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public boolean isHomePagePresent(){
        return driver.findElements(By.className("header-logo")).size()>0;
    }
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[text()='Register']"));
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void clickOnContinueButton() {
        click(By.xpath("//input[@class='button-1 register-continue-button']"));
    }

    public void fillRegisterLoginForm(User user) {
        type(By.id("FirstName"), user.getName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getConfirmPassword());
    }
    public void fillLoginForm(RegisterUser registerUser){
        type(By.id("Email"), registerUser.getEmail());
        type(By.id("Password"), registerUser.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void addToCard() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@value='Log in']"));
    }

    public boolean isProductAdded() {
        click(By.xpath("//span[.='Shopping cart']"));
        List<WebElement> cardElements = driver
                .findElements(By.xpath("(//a[text()='14.1-inch Laptop'])[2]"));
        for (WebElement element:cardElements){
            if (element.getText()!= null);
            return true;
        }
        return false;
        }
}
