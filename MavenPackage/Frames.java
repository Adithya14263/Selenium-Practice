package MavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		// mainframe page
		driver.findElement(By.id("name")).sendKeys("mainframe1");
		
		// switchTo frame1
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("course"));
		Select courseNames = new Select(driver.findElement(By.id("course")));
		courseNames.selectByVisibleText("Java");
		Thread.sleep(2000);
		
		//mainframe page		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("mainframes2");
		Thread.sleep(2000);
		
		//switchTo frame2
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("frame2--1");
		Thread.sleep(2000);
		
		//mainframe page
		driver.switchTo().defaultContent();

		//switchTo frame 1
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("course"));
		Select coursnames = new Select(driver.findElement(By.id("course")));
		coursnames.selectByVisibleText("Javascript");
		Thread.sleep(2000);
		
		//mainframe page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("mainframes3");
	}

}