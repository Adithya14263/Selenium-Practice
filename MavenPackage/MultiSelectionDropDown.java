package MavenPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropDown {

public static void main(String[] args) throws InterruptedException  {
		
		// Multy  Selection DropDown Method   //
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			Thread.sleep(2000);
			
			driver.findElement(By.id("ide"));
			WebElement courseNames = driver.findElement(By.id("ide"));
			Select DropDown = new Select (courseNames);
			
			//Console Print  Start
			List<WebElement> DropDownOptions = DropDown.getOptions();
			for(WebElement Options : DropDownOptions) {
				System.out.println(Options.getText());
			}
			//Console Print End
			
			
	      	//	Method 1
		     DropDown.selectByIndex(0);   //Java
			Thread.sleep(2000);
			
			// Method 2
			DropDown.selectByValue("ij");   // IntelliJ IDEA
			Thread.sleep(2000);
			
			// Method 3
			DropDown.selectByVisibleText("NetBeans");  // NetBeans
			Thread.sleep(2000);
			
			// Deselected
		    DropDown.deselectByVisibleText("IntelliJ IDEA");
			
			
			//Console print 
			List<WebElement> Options = DropDown.getAllSelectedOptions();
			for( WebElement AllOptions : Options ) {
				System.out.println("Only Selected Options :"+AllOptions.getText());
			}
			
			
			
			
		}
	 
		
		
	}
