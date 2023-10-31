package aving;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Library<firefoxDriver> 
{
	FirefoxDriver driver;
@BeforeSuite
public void appLaunch()
{
	driver= new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
}
@BeforeTest
public void appLogin()
{
	driver.findElement(By.xpath("oxd-input oxd-input--active")).sendKeys("Admin");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
}
@AfterTest
public void appLogout()
{
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	
}
@AfterSuite
public void appClose()
{
	driver.close();
}

}
