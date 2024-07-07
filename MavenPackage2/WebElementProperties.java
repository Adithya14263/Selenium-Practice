package MavenPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementProperties {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		//getTagName
		driver.navigate().to("https://github.com/login");
		driver.findElement(By.name("login")).getTagName();
		System.out.println(driver.findElement(By.name("login")).getTagName());
		
		//getAttributeValue
		driver.findElement(By.id("password")).getAttribute("class");
		System.out.println(driver.findElement(By.id("password")).getAttribute("class"));
		
		//get your Text
		WebElement text =driver.findElement(By.id("login_field"));
		text.sendKeys("ADITHYA");
		System.out.println(text.getAttribute("value"));
		
		// get CssValue
		driver.findElement(By.name("commit")).getCssValue("background-color");
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		
		// Xpath pending
		
	}

}