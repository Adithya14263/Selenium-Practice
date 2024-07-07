package MavenPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception   {
		
		WebDriverManager.chromedriver().setup();
	//	RemoteWebDriver driver = new ChromeDriver();
	//	                     or
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		 
		File SreenShot =  driver.getScreenshotAs(OutputType.FILE);
		File ScreenshotPath = new File("./Screenshot/imgg5.png");
		 FileUtils.copyFile(SreenShot, ScreenshotPath);
	 
		System.out.println("sucussfully completed");
		
		
		
		
		//Cating mathod 
/*		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		//          OR  use casting method
		//WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.youtube.com/watch?v=mcgF-ZN8YPY");
		TakesScreenshot Sc = (TakesScreenshot) driver;
	File ScreenShot =	Sc.getScreenshotAs(OutputType.FILE);
	File ScreenshotPath = new File ("./Screenshot/img9.png");
		FileUtils.copyFile(ScreenShot, ScreenshotPath);
		System.out.println("sucussfully completed");
		
		
		*/
		
	}

}