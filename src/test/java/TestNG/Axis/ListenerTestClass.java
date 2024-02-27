package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(ListenerClass.class)
public class ListenerTestClass {
	
	@Test
	public void invokechrome() {
		
		
		
		System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
	}
}
		
		