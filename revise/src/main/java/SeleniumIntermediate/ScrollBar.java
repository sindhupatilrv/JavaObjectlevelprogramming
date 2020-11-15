package SeleniumIntermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {

	WebDriver driver; 
	
	@Test(priority = 1)
	public void scrollup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/selenium-tutorials/webdriver-wait-examples");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'fancy-collapse-panel')]"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
		 js.executeScript("window.scrollTo(40,700)");
		 Thread.sleep(5000);
		//this will scroll till end of the page
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		driver.close();
		driver.quit();
		
				
	}
}
