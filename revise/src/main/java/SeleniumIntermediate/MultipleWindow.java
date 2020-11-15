package SeleniumIntermediate;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/* 
 * Multiple window - switching between parent window to child window
 * using window handlings method and set and iterartion concepts
 */
public class MultipleWindow {
	
	WebDriver driver;
	
	@Test
	public static void loginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,400)");
//		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		Set<String> NewWindow = driver.getWindowHandles();
		
		Iterator<String> it = NewWindow.iterator();
		
		String Parentwindow = it.next();
	//	System.out.println("Parent window pagei is" + Parentwindow);
		
		String childWindow = it.next();
		// System.out.println("Child window page is" + childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window pop up title\n" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(Parentwindow);
		System.out.println("Parent window title\n" + driver.getTitle());
		
		driver.close();
	}
}
 