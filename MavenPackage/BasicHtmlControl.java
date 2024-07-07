package MavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicHtmlControl {

	
		// * How to handle the links,buttons,radio buttons and checkboxes using   webdriver?
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
			Thread.sleep(2000);
			
		   
			driver.findElement(By.id("femalerb")).click();          //RADIOBOX  //
		    Thread.sleep(2000);
		   
		driver.findElement(By.id("englishchbx")).click();            //CHECKBOX 1//
		Thread.sleep(2000);
		
		driver.findElement(By.id("hindichbx"));                      //CHECKBOX 2//                                               
		WebElement checkbox = driver.findElement(By.id("hindichbx"));
		checkbox.click();              // check
		Thread.sleep(2000);
		
		if(checkbox.isSelected()) 
		checkbox.click();             //uncheck
		
		
		 //BUTTON//
		
		driver.findElement(By.id("registerbtn")).click();            
		Thread.sleep(2000);
		
		driver.findElement(By.id("msg"));

		//Console Print 	
		String text = driver.findElement(By.id("msg")).getText(); 
		System.out.println(text);
		Thread.sleep(2000);
		
		//LINKTEXT//
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();  
		
	}

}
