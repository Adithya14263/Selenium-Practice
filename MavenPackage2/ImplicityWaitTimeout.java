package MavenPackage2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaitTimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);

driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
driver.findElement(By.id("btn1")).click();
driver.findElement(By.id("txt1")).sendKeys("Adithya");

	}

}
