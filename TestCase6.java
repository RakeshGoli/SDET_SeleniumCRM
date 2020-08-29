package CRMActivities;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestCase6 {

	WebDriver driver;
		
		@BeforeTest
		public void beforeTest6()
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.navigate().to("https://alchemy.hguy.co/crm/");
		
		}
		@Test
		public void testCase6() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			String activities = driver.findElement(By.id("grouptab_3")).getText();
			driver.findElement(By.id("grouptab_3")).click();
			Thread.sleep(5000);
			System.out.println("TestCase6-->Menu Item " +activities+ "Exists");
			Reporter.log("TestCase6-->Menu Item" +activities+ "Exists");
		}
		@AfterTest
		public void afterTest6()
		{
			driver.close();
		}


}
