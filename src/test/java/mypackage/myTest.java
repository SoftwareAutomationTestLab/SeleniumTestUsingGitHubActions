package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;
import java.io.File;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class SimpleTest {
    WebDriver driver;
    @BeforeTest
            public void setup(){

        System.out.println("set up headless browser..");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);}

    @Test
    public void opengoogle(){
        System.out.println("starting Test...");
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("Page title is :"+title);
        System.out.println("End Test...");}

    @AfterTest
    public void teardown() {
        driver.quit();
    System.out.println("closing the browser...");}
}

