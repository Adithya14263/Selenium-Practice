package RelativeXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXPath {

	public static WebDriver driver;
	public static void main(String[] args)  {
WebDriverManager.chromedriver().setup();
  driver =new ChromeDriver();
  
 //Realtivexpath();
// XpathOperators()
  XpathCondition1();
  
	}
 public static void Realtivexpath() {
 driver.navigate().to("https://www.w3schools.com/");	
	 driver.findElement(By.xpath("//a[@title='Our Services']"));
	 highlight(driver.findElement(By.xpath("//a[@title='Our Services']")));
	 highlight(driver.findElement(By.xpath("//div[@role='button']")));                     
	 }
 
 public static void XpathOperators() {
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("King");
	highlight(driver.findElement(By.xpath("//input[@maxlength=10]")));
		
	         //           OR
		
List<WebElement>Elements = driver.findElements(By.xpath("//input[@maxlength>=10]"));
		for(WebElement Element:Elements) {
			highlight(Element);
		}	
	}
 //XpathCondition1            TextBox highlight
 public static void XpathCondition1() {
	 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	List<WebElement> conditions =driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"));
	for(WebElement Element:conditions) {
		highlight(Element);
	}	
 }
 
 
//XpathCondition2         ElementText & highlight
 public static void XpathCondition2() {
	 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	 driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']")).sendKeys("adhi");
     highlight(driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']")));
 }
 
 
//XpathCondition3     How many Elements identified index console print
 public static void XpathCondition3() {
	 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	List<WebElement> condition= driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']")); 
	 System.out.println(condition.size());
	 
 }
 
public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	
	}

}