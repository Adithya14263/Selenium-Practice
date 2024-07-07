package MavenPackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowMaximize {

	public static void main(String[] args) throws Exception {
		//Chrome way1
	    WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(option);		
		driver.get("https://www.google.com/webhp");
		
		/*WebEdge  way1
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions() ;	
        ((ChromeOptions) option).addArguments("start-maximized") ;
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.google.com/webhp");    */
		
		
		
	/*  Firefox way 
	 	WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("start-maximized");
		FirefoxOptions driver = new FirefoxOptions(option);
		driver.get("https://www.google.com/webhp");
		driver.get("https://www.google.com/webhp");  */

	}

}