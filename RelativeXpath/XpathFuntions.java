package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFuntions {
	public static WebDriver driver;
	public static void main (String[]args) {
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	textFunction();
	//ContainsFuction1();
	//ContainsFuction2();
	//StartWithFunction();
    //NormalizeSpaceFunction();
    //LastFunction();
    //PositionFunction();
	}
	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	
	// Text Function ---->  This is Identifies Text Elements (Like Label Text)
	public static void textFunction() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	String text=driver.findElement(By.xpath("//h1[text()='Register']")).getText();
	System.out.println(text);
	highlight(driver.findElement(By.xpath("//h1[text()='Register']")));
		}
	
	//Contains Function1 ---->  This is Identifies  ParticalText Elements (Like Label,header Text)
	public static void ContainsFuction1() {                                                                 //use text
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//a[contains(text(),'into account')]"));                         
		highlight(driver.findElement(By.xpath("//a[contains(text(),'into account')]")));
		
	}
	//Contains Function2 ---->  This is Identifies  ParticalText Elements (Like Label,header Text)
	public static void ContainsFuction2() {                                                                    //use attribute
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	    driver.findElement(By.xpath("//div[contains(@class,'sign')]"));
		highlight(driver.findElement(By.xpath("//div[contains(@class,'sign')]")));                       
	}
	
	//Starts-With Function ----->  This is Identifies StartingText endingText -Elements ((Like Label,header Text)
	public static void StartWithFunction(){
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//label[starts-with(text(),'Repeat')]"));
		highlight(driver.findElement(By.xpath("//label[starts-with(text(),'Repeat')]")));
		
	}
	
	//Normalize-space Function  ----->  Remove the Starting And Ending Text Space    (Like Label,header Text)
	public static void NormalizeSpaceFunction() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign in into account']"));
		highlight(driver.findElement(By.xpath("//a[normalize-space(text())='Sign in into account']")));
	}
	
	//Last Function ----> Identifies the Last TextElement in the table
	public static void LastFunction() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]"));
		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));
	}
	
	// Position Function ----> Identifies the Position of TextElement in the table
	public static void PositionFunction() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>=3]"));
	highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>=3]")));
	
	}
}
	