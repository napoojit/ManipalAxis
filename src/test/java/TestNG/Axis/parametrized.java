package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrized {

	
@Test
@Parameters("browser")
public void Parametrized(String browser) {

	if (browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","//Users//Poojitha//drivers//chromedriver-mac-x64//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		
	}
	else {
		
		System.setProperty("webdriver.edge.driver", "/Users/Poojitha/Selinium_Java/msedgedriver");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");
		
	}
}
}

