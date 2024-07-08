package dependson;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void verifyFundTransfer() {
        Assert.assertTrue(false);
        System.out.println("Verify Fund Transfer");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransferWithSavings() {
        System.out.println("Verify Fund Transfer With Savings");
    }

    @Test
    public void verifyCashBackOffer() {
        System.out.println("Verify CashBack Offer");
    }
}
