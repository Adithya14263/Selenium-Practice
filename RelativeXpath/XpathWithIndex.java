package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathWithIndex {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();  
		driver = new ChromeDriver();
		index1();
		
	}
	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	

}
	// Identifies the Row elements using index
	public static void index1() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	String element=	driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")).getText();
	System.out.println(element);
	
		highlight(driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]")));
		
	}
//	Identifies the Rows & Columns cells elements using index
	public static void index2() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
String text =driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[23]")).getText();
System.out.println(text);

highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[23]")));
	}
	
}