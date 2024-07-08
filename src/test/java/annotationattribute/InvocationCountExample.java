package annotationattribute;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 7)
    public void invocationExample(){
        System.out.println("Invocation Demo");
    }
    @Test(invocationCount = 10, invocationTimeOut =7)
    public void invocationExample1(){
        System.out.println("Invocation Timeout Demo");
    }
}
