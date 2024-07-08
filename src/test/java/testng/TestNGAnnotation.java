package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1() {
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase2() {
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
