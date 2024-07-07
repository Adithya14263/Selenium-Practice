package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShortcutsOrAbbreviations {

	public static WebDriver driver;
	
	public static void main (String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			driver.manage().window().maximize();
		
			
		// xpath function text()----> represented symbol-----> .  ----> . 
			driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			highlight(driver.findElement(By.xpath("//h1[.='Register']")));               //     //h1[text()='Register']
			Thread.sleep(2000);
			
			highlight(driver.findElement(By.xpath("//a[contains(.,'account')]")));       //   //a[contains(text(),'account')]
			Thread.sleep(2000);
			
			highlight(driver.findElement(By.xpath("//label[starts-with(.,'Repeat')]")));  // //label[starts-with(text(),'Repeat')
			
		//	xpathaxes child ----->//
			
			highlight(driver.findElement(By.xpath("//div[@class='buttons']/child::button[2]")));
			Thread.sleep(2000);
			
			
			
			
//			xpathAxes parent ----->/..
			highlight(driver.findElement(By.xpath("//button[@type='reset']/..")));         //   //button[@type='reset']/parent::div
			
			highlight(driver.findElement(By.xpath("//div[@class='post-footer']/..")));    //    div[@class='post-footer']/parent::div
			
		}
		public static void highlight(WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}
			
			
		}