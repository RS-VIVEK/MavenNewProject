package priority;

import org.testng.annotations.Test;

public class PriorityExample {

    //Execute test method based on priority number-negative/zero/positive numbers

    @Test(priority = 5)
    public void testCaseA() {
        System.out.println("TestCase A");
    }

    @Test(priority = 0, enabled = false) // Disable a Test with @Test( enabled=false)
    public void testCaseM() {
        System.out.println("TestCase M");
    }

    @Test(priority = 'r')
    public void testCaseF() {
        System.out.println("TestCase F");
    }

    @Test(priority = 'A')
    public void testCaseC() {
        System.out.println("TestCase C");
    }

    @Test(priority =10)
    public void testCaseX() {
        System.out.println("TestCase X");
    }


    @Test(priority = -1)
    public void testCaseZ() {
        System.out.println("TestCase Z");
    }
}
