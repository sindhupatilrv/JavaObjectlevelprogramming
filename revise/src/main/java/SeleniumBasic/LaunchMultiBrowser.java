package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchMultiBrowser {

	WebDriver driver;
	private String url = "https://www.google.com";
	
	@Test(priority = 1)
	public void chrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window();
		driver.close();
		
	}

	@Test(priority = 2)
	public void firfox() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.close();
	}
	
	@Test(priority = 3)
	public void egde() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.close();
	}
}
