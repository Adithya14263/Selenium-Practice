package MavenPackage2;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadPageTimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);   // To set the  Pageload Time Limit //
		
	Instant startTime =	Instant.now();                                     // Browser start loading time
	System.out.println(startTime);
		driver.get("https://en.wikipedia.org/wiki/Ireland");
		Instant EndTime = Instant.now();                                   // Browser end time time
		System.out.println(EndTime);
		
		Duration differences = Duration.between(startTime, EndTime);       // Difference between Start and End time
		System.out.println("PageloadTime"+differences.toMillis());
		System.err.println("this is Pageload title "+driver.getTitle());
	}

}