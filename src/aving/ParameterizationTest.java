package aving;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{
 @Test(dataProvider = "getdata")
 public void sample(String username,String password)
 {
	 System.out.println("username is :" +username);
	 System.out.println("password is :" +password);
	 
 }
 @DataProvider
 public Object[][] getdata()
 {
	 Object[] [] data = new Object[1][2];
	 data[0][0] = "avinash";
	 data[0][1] = "selenium";
	 
	 return data;
 }
}
