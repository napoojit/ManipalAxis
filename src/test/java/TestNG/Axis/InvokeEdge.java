package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdge {
	
	public static WebDriver driver;
	@Test
	public void invokeEdge() {

		System.setProperty("webdriver.edge.driver", "/Users/Poojitha/Selinium_Java/msedgedriver");

	 driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/");
	}

}
