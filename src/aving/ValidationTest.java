package aving;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
   @Test
   public void validation()
   {
	   String data1="avi";
	   String data2="avi";
		/*
		 * if(data1.equals(data2)) { System.out.println("pass"); }else {
		 * System.out.println("fail"); }
		 */
	   Assert.assertEquals(data1, data2);
   }  
}
