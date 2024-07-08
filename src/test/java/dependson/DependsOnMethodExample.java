package dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void createNewUser() {
        System.out.println("Create New User");
    }

    @Test(dependsOnMethods ="verifyLogin",alwaysRun = true) // TestCase method run always
    public void fundTransfer() {
        System.out.println("Fund Transfer");
    }
}
