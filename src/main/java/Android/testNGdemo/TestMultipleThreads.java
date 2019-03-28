package Android.testNGdemo;

import org.testng.annotations.Test;

public class TestMultipleThreads {

    @Test(invocationCount = 10,threadPoolSize = 2)
public void threadtest(){

     System.out.printf("threadtest Threadid:%s%n",Thread.currentThread().getId());

}

}
