package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromeBrowser {
	
	@Test

		
		 public void invokechrome() {
			  
    	System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");

       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://webdriveruniversity.com");
	}

}
