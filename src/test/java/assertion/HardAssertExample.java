package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssertStatment() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        Assert.assertEquals(textTitle, "Create a Rediffmail account", "Test should be Create a Rediffmail account");
        boolean userName = driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).isDisplayed();
        System.out.println(userName );
        Assert.assertTrue(userName, "Username textbox should be displayed...");
        driver.close();
    }
}