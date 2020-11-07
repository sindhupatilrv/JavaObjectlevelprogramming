package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
	

public static void main (String[] args) throws InterruptedException {
	WebDriver driver;
	String url = "https://www.google.com";
	
	WebDriverManager.chromedriver().setup(); 
	driver = new ChromeDriver();
	
	driver.get(url);
	driver.getTitle();
	System.out.println("Title of the page is:" + driver.getTitle());
	Thread.sleep(10);
	driver.navigate().to("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().back();
	Thread.sleep(10);
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
	driver.close();
	driver.quit();
	
}

}