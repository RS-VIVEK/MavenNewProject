package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void test1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void test2(){
        System.out.println("Test Case 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
}
