package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAttribute {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  
		 Realtivexpath();

			}
		 public static void Realtivexpath() {
			 driver.navigate().to("https://www.w3schools.com/");	
        	String text=driver.findElement(By.xpath("//a[@title='Our Services']")).getText();
           	System.out.println(text);
			 highlight(driver.findElement(By.xpath("//a[@title='Our Services']")));
			// highlight(driver.findElement(By.xpath("//div[@role='button']"))); 
			 }
		 
		public static void highlight(WebElement element) {
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			

	}

}