/* 
/*4.	Write a Program and use at least 6 commands that are taught in Commands used in Real time
•	/* 2.	Find all the Links on the Amazon.ca Home Page and print there Link Text
•	 *  3.	Create a working example for 3 different type of Wait statements i.e., Implicit Wait, Explicit Wait and Fluent Wait
•*/

package SeleniumBasic;
import java.util.concurrent.TimeUnit;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class WaitCommandsInSelenium {
	
		public static void main(String[] args) throws InterruptedException {
				
			WebDriver driver;
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			//Implicitly Wait()
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().to("https://www.amazon.ca/");
			
			//Sleep Command
			driver.navigate().to("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("google");
			Thread.sleep(100);
			
			String title = driver.getTitle();
			
			//Pageload time
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			
			//Explicit Wait
			WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.titleIs(title));
					
					
			//SetScriptTimeout
			driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
				
			driver.close();
			driver.quit();
			
			
			//
			
		}
	}
 


