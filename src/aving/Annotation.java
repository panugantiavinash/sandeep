package aving;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Annotation 
{
	@BeforeTest
    public void beforeTest()
    {
    	System.out.println("beforeTest Executed");
    }
    @org.testng.annotations.Test
    public void test1()
    {
    	System.out.println("test1 executed");
    }
    //@Test
    //public void test2()
    //{
    	//System.out.println("test2 executed");
    //}
    @AfterTest
    public void afterTest()
    {
    	System.out.println("afterTest Executed");
    }

}
