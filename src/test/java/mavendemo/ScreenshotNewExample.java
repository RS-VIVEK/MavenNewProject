package mavendemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotNewExample {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/search?q=selenium");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2024-06-24 184555"+timestamp()+".png");
        FileUtils.copyFile(f, des);
        driver.close();
    }

    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
