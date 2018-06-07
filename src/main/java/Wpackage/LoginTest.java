package Wpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		  driver = new FirefoxDriver();
		
	}
    @Test
	public void dologin()
	{
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("identifierId")).sendKeys("pellurisure@gmail.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		
	}
}
