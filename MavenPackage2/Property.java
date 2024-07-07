package MavenPackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		 driver.navigate().to("https://careers.king.com/");
		 
		 // currentUrl
		 String url =driver.getCurrentUrl();
		 System.out.println("This is a current url "+url);
		 
		 //title
		 String title =driver.getTitle();
		 System.out.println("this is a page title"+title);
		 
		 // page sources
		String htmlsources= driver.getPageSource();
		 System.out.println("This is a pageSource"+htmlsources);

	}

}