package MavenPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		
		//this is windows handling or tab handling same process  // net speed slow
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String ParentWindows = driver.getWindowHandle();                           // find Parent window address
		System.out.println("This is ParentWindows address : "+ ParentWindows);
    	Thread.sleep(9000);
	 	driver.findElement(By.className("whButtons")).click();
		Thread.sleep(3000);
		Set<String> ChildWindow=driver.getWindowHandles();                         //find Child window address
		for(String Windows : ChildWindow) {                                          //find Child parents window address              
			driver.switchTo().window(Windows);
			driver.manage().window().maximize();
			 
			driver.findElement(By.id("firstName")).sendKeys("Adithya");
			Thread.sleep(3000);
			System.out.println("This is Parent and child windows address : "+Windows);
		}
		//return to parentWindow
		Thread.sleep(3000);
		driver.switchTo().window(ParentWindows);
		
		
			}

}
