package CRMActivities;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestCase8 {

	WebDriver driver;
		
		@BeforeTest
		public void beforeTest8()
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.navigate().to("https://alchemy.hguy.co/crm/");
			
		
		}
		@Test
		public void testCase8() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("grouptab_0")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("moduleTab_9_Accounts")).click();
			Thread.sleep(5000);
			int i;
			for(i=1;i<=10;i++)
			{
				if(i%2!=0)
				{
				String name = driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[@align='left']/b/a")).getText();	
				System.out.println("TestCase8-->The Name is "+name);
				Reporter.log("TestCase9-->The Name is "+name);
				
				}
				
			}
			
		
		}
		@AfterTest
		public void afterTest8()
		{
			driver.close();
		}


}
