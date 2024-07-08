package testng;

import org.testng.annotations.*;

public class BeforeAfterClass {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


}
