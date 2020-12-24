


	import org.openqa.selenium.By;
     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	public class TC001
	{
		public WebDriver driver;
		@Given("^Open HRMS application$")
		public void openbrowser()
		{
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumSoftwares\\chromedriver_win32 (4)\\chromedriver.exe");
			
		driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			}
		@When("^Typing User name and Password$")
		public void login() throws Exception
		{
			System.out.println("Typing User name and Password");
			
			driver.findElement(By.name("txtUsername")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			
			System.out.println("login successfully");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			}
		@Then("^Login page should be shown and  Logout from the application$")
		public void logout() throws Exception
		{
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable
		(driver.findElement((By.id("welcome")))));
		
		driver.findElement(By.id("welcome")).click();
		
				Thread.sleep(4000);
       driver.findElement(By.linkText("Logout")).click();

		System.out.println("logout successfully");
		}
				
		@Then("^browser should be closed$")
		public void closebrowser()
		{       
			driver.close();
			System.out.println("close the browser");
			
	}
}
