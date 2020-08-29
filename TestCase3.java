package CRMActivities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {

WebDriver driver;
	
	@BeforeTest
	public void beforeTest3()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
	
	}
	@Test
	public void testCase3() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String fcopyright = driver.findElement(By.id("admin_options")).getText();
		System.out.println("TestCase3-->First Copyright name is:" +fcopyright);
		Reporter.log("TestCase3-->First Copyright name is:" +fcopyright);
		
	}
	@AfterTest
	public void afterTest3()
	{
		driver.close();
	}
	
}
