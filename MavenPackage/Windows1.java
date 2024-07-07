package MavenPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows1 {

	public static void main(String[] args) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS );
	
		driver.get("https://www.hoopladigital.com/movie/oppenheimer-the-real-story-robert-oppenheimer/16025815");
		
		String ParentWindow1 =driver.getWindowHandle();
		System.out.println("This is parent window address:"+ ParentWindow1);
		
		driver.findElement(By.className("react-share__ShareButton")).click();
		Thread.sleep(2000);
		Set<String>ChildWindow=driver.getWindowHandles();
		for(String Windows:ChildWindow) {
			driver.switchTo().window(Windows);
			
			
			
			System.out.println("This is parent window address:"+Windows);
			
		//	driver.findElement(By.name("email")).sendKeys("Thota Kalyan");
			
			Thread.sleep(2000);
		}
		driver.findElement(By.name("email")).sendKeys("Thota Kalyan");
	
		driver.findElement(By.id("pass")).sendKeys("Gunturu Karam");
	}
			}
