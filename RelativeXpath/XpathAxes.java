package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static WebDriver driver;

	public static void main(String[] args)  {
		
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			driver.manage().window().maximize();
		
			//followingSibling();
		    //precedingSibling();
			//parent1()	;	
			//parent();
			//child1();
			//child2();
			//descendant();
			//ancestor();
		//	following();
			preceding();
			}
			
			public static void highlight(WebElement element) {
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			}
			//followingSibling
			public static void followingSibling() {
			driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			highlight(driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[@maxlength='15']")));
			}
		//	precedingSibling
			public static void precedingSibling() {
			//	highlight
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input")).click();
			}
			
			public static void precedingSibling1() {
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/preceding-sibling::td")));
			}
			
			public static void parent() {
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/parent::tr")));
				
				
			}
			
			public static void child1() {
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/tr/th[text()='Country']")));
			}
			
			public static void child2() {
			
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/tr")));
			}
			
			public static void descendant() {
				
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//table[@id='contactList']/descendant::*")));
	 }
	public static void ancestor() {
				
				driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
				highlight(driver.findElement(By.xpath("//a[text()='Click']/ancestor::tr/td")));
				
	 }
	public static void following() {
		
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlight(driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input")));

	}
	public static void preceding() {
		
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		highlight(driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input")));

	}

	}