package CRMActivities;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestCase7 {

	WebDriver driver;
		
		@BeforeTest
		public void beforeTest7()
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.navigate().to("https://alchemy.hguy.co/crm/");
		
		}
		@Test
		public void testCase7() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			//String sales = driver.findElement(By.id("grouptab_0")).getText();
			driver.findElement(By.id("grouptab_0")).click();
			Thread.sleep(5000);
			//String leads = driver.findElement(By.id("moduleTab_9_Leads")).getText();
			driver.findElement(By.id("moduleTab_9_Leads")).click();
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//*[@class='list view table-responsive']/tbody/tr/td/b/a[contains(text(), 'Miss Test1')]/ancestor::td/following-sibling::td[@align='right']"));
			element.click();
			Thread.sleep(5000);
			String phoneno =driver.findElement(By.xpath("//*[@id='ui-id-5']/span")).getText();
			System.out.println("TestCase7-->Phone Number is"+phoneno);
			Reporter.log("TestCase7-->Phone Number is"+phoneno);
		}
		@AfterTest
		public void afterTest7()
		{
			driver.close();
		}


}
