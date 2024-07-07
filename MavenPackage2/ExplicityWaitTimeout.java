package MavenPackage2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWaitTimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS );
	
		WebDriverWait wait = new WebDriverWait(driver, 4);       // Explicit Wait timeout
		
		driver.get("https://www.hoopladigital.com/movie/oppenheimer-the-real-story-robert-oppenheimer/16025815");  //movie free download Website//
		
		String ParentWindow1 =driver.getWindowHandle();
		System.out.println("This is parent window address:"+ ParentWindow1);
		
		driver.findElement(By.className("react-share__ShareButton")).click();
		
		Set<String>ChildWindow=driver.getWindowHandles();
		for(String Windows:ChildWindow) {
			driver.switchTo().window(Windows);
			
			System.out.println("This is child window address:"+Windows);
			
		
		}
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));    // visual of thota kalyan
		driver.findElement(By.name("email")).sendKeys("Thota Kalyan");
	
		driver.findElement(By.id("pass")).sendKeys("Gunturu Karam");
	}
			

	}