import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


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
