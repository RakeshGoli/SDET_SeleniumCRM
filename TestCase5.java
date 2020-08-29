package CRMActivities;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestCase5 {

	WebDriver driver;
		
		@BeforeTest
		public void beforeTest5()
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.navigate().to("https://alchemy.hguy.co/crm/");
		
		}
		@Test
		public void testCase5() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			WebElement color = driver.findElement(By.id("grouptab_0"));
			System.out.println("TestCase5-->Navigation menu color is:" +color.getCssValue("color"));
			Reporter.log("TestCase5-->Navigation menu color is:" +color.getCssValue("color"));
		}
		@AfterTest
		public void afterTest5()
		{
			driver.close();
		}


}
