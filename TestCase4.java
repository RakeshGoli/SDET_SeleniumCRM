package CRMActivities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase4 {

WebDriver driver;
	
	@BeforeTest
	public void beforeTest4()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
	
	}
	@Test
	public void testCase4() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
		String homeverification = driver.findElement(By.id("grouptab_0")).getText();
		String homeexpected ="SALES";
		assertEquals(homeverification, homeexpected);
		System.out.println("TestCase4-->Successfully Logged in and Verified with the menu item " +homeverification);
		Reporter.log("TestCase4-->Successfully Logged in and Verified with the menu item" +homeverification);
		
	}
	@AfterTest
	public void afterTest4()
	{
		driver.close();
	}
	
}
