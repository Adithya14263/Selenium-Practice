package MavenPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectionDropDown {

	// How to handle the SingleSelectionDopDown using selenium Webdriver //
	public static void main (String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		//Single DropDown Selection Method
		driver.findElement(By.id("course"));
		WebElement CourseName = driver.findElement(By.id("course"));
		Select CourseDropDown = new Select(CourseName);
		
		//Console Print Start
		 List<WebElement> CourseDropDownNames = CourseDropDown.getOptions();
		for(WebElement AllOptions : CourseDropDownNames) {
			System.out.println(AllOptions.getText());
		}
		
		
		
		// Method 1
		
		CourseDropDown.selectByIndex(1);     // Java  
		Thread.sleep(2000);
		
//		Method 2
		CourseDropDown.selectByValue("net");  // Dot Net 
		Thread.sleep(2000);
		
		//  Method 3
		CourseDropDown.selectByVisibleText("Javascript");  // Javascript 
		Thread.sleep(2000);
		
		// Console Print First Select Option	
		 String Option =	CourseDropDown.getFirstSelectedOption().getText();
		 System.out.println("First Select Option:"+Option);
		 
		 }	
	}
