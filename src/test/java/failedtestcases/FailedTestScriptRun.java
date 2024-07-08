package failedtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestScriptRun implements IRetryAnalyzer {


    private int retryCount = 0;
    public static final int maxRetryCount = 7;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
