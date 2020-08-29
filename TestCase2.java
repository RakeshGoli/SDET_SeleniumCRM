package CRMActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest2()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
	
	}
	@Test
	public void testCase2() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.tagName("img"));
		String source = element.getAttribute("src");
		System.out.println("TestCase2-->Url Of The Header Image is:" +source);
		Reporter.log("TestCase2-->Url Of The Header Image is:" +source);
	}
	@AfterTest
	public void afterTest2()
	{
		driver.close();
	}

}
