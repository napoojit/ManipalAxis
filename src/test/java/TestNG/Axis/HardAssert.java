package TestNG.Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
  @Test
  public void testhardassert() throws InterruptedException{
		
		
	  System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "OrangeHRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		
		driver.close();
		
		
		
	}
}
