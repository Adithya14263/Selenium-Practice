package MavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main (String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("APjFqb")).sendKeys("Adithya");
		 Thread.sleep(2000);
		 driver.findElement(By.id("APjFqb")).submit();
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://m.facebook.com/login/?refsrc=deprecated");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("m_login_email")).sendKeys("adithya14263@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 
		 driver.quit();
	 
	 }	
} 
