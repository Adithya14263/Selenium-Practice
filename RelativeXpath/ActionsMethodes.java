package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethodes {

//	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://nationalskillsregistry.com/");
Thread.sleep(3000);
 


Actions action= new Actions (driver);
action.moveToElement(driver.findElement(By.xpath("//img[@name=\"knownsr\"]"))).perform();
Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("//div[@id=\"myAlternativeContent\"]"))).click().perform();
Thread.sleep(3000);
driver.navigate().back(); 

action.moveToElement(driver.findElement(By.xpath("//img[@name='companies']"))).perform();
//Thread.sleep(3000);
//driver.navigate().back(); 
Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("//div[@id='myAlternativeContent']"))).click().perform();
Thread.sleep(2000);

	
	//double click 

driver.findElement(By.xpath("//input[@name='frm_str_searchPara']")).sendKeys("Adithya");;

	action.doubleClick(driver.findElement(By.xpath("//input[@name='frm_str_searchPara']"))).perform();       

//RightClick  or contextClick

driver.findElement(By.xpath("//a[text()='Login']/parent::div[@class='topright-col2']"));
action.contextClick(driver.findElement(By.xpath("//a[text()='Login']/parent::div[@class='topright-col2']"))).perform();

	
	}	


public static void highlight(WebDriver driver, WebElement element) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
}
}