package CRMActivities;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestCase9 {

	WebDriver driver;
		
		@BeforeTest
		public void beforeTest9()
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.navigate().to("https://alchemy.hguy.co/crm/");
		
		}
		@Test
		public void testCase9() throws InterruptedException
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("grouptab_0")).click();
			Thread.sleep(5000);
			//String leads = driver.findElement(By.id("moduleTab_9_Leads")).getText();
			driver.findElement(By.id("moduleTab_9_Leads")).click();
			Thread.sleep(5000);
			int i;
			for(i=1;i<=10;i++)
			{
			
				String leadname = driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[3]/b/a")).getText();
				String usertype = driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[8]/a")).getText();
				System.out.println("TestCase9-->LeadName is " +leadname+ "Which is of Usertype "+usertype);
				Reporter.log("TestCase9-->LeadName is " +leadname+ "Which is of Usertype "+usertype);
				
			}
		}
		@AfterTest
		public void afterTest9()
		{
			driver.close();
		}


}
