package MavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBoxes {

		public static void main(String[] args) throws Exception    {
			// TODO Auto-generated method stub
			 			 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			Thread.sleep(3000);
			
			//AlertBox
			driver.findElement(By.id("alertBox")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().getText();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
	        driver.switchTo().alert().accept();
			driver.findElement(By.id("output")).getText();
			System.out.println(driver.findElement(By.id("output")).getText());
			Thread.sleep(3000);  
			
			//to run individual
			
			//ConfirmBox 
			driver.findElement(By.id("confirmBox")).click();   
			Thread.sleep(3000);
			driver.switchTo().alert().getText();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());
			//Thread.sleep(3000);  

			
			//promptBox
			
			driver.findElement(By.id("promptBox")).click();
		//	Thread.sleep(3000);
			driver.switchTo().alert().getText();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().sendKeys("Adithya Thota");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());
			
			
			}
		}

