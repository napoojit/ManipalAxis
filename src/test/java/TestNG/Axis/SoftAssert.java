package TestNG.Axis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SoftAssert {
	
	@Test
	
	public void testassert() throws InterruptedException{
		
		SoftAssert st = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "OrangeHRM";
		
		Thread.sleep(500);
		
		st.assertEquals(actualTitle, expectedTitle);
        
        
            
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
			
		Thread.sleep(500);
			
		driver.close();	
		
		
	}

	private void assertEquals(String actualTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}

	
}
