package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.navigate().to(" https://www.hyrtutorials.com/");

		JavascriptExecutor   jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0,550)");
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollBy(0,550)");
	Thread.sleep(2000);

		jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView()");

   Thread.sleep(2000);
		WebElement colour = driver.findElement(By.xpath("//a[text()='Contact']"));
		System.out.println(colour);
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px blue solid;background: orange');",colour);
		
		
	}
}