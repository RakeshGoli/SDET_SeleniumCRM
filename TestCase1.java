package CRMActivities;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest1()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
	
	}
	
	@Test
	public void testCase1() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String actualtitle=driver.getTitle();
		String expectedtitle="SuiteCRM";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("TestCase1-->The tiltle of the page is: "+actualtitle);
		Reporter.log("TestCase1-->The tiltle of the page is: "+actualtitle);
	}
	
	@AfterTest
	public void afterTest1()
	{
		driver.close();
	}
}
