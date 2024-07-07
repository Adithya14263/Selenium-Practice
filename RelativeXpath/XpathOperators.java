package RelativeXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathOperators {

	public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 XpathOperators2();

	}
	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	
	//XpathOperators1           TextBoxs Highlight 
	public static void XpathOperators1() {
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
List<WebElement>Elements = driver.findElements(By.xpath("//input[@maxlength>=10]"));
		for(WebElement Element:Elements) {
			highlight(Element);
		}
	}
	
	//XpathOperators2      ElementText  highlight      
		public static void XpathOperators2() {
			driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("King");
			highlight(driver.findElement(By.xpath("//input[@maxlength=10]")));
		
	}

}