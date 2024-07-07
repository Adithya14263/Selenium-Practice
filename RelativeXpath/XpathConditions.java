package RelativeXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConditions {

	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		XpathCondition3();
	}
	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	
	
	//              ElementText & highlight
	public static void XpathCondition1() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
//		                       AND Condition  (must and should b e all condition satisfied)
		
		//driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']")).sendKeys("Adhu");
		//highlight(driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']")));
		
//                              OR condition (any one condition satisfied )
driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' or @type='tQext']")).sendKeys("PSPK");
highlight(driver.findElement(By.xpath("//input[@maxlength<=15 and @name='name' or @type='tQext']")));
	}
	
	
	//               TextBoxes highlight
	public static void XpathCondition2() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> conditions=driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"));
		for(WebElement Element: conditions) {
			highlight(Element);
		}
	}
	
	  //             Find Element Elements identified index console print
	public static void XpathCondition3() {
//		                                     And
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	List<WebElement> conditions=	driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' and @type='text']"));
		System.out.println(conditions.size());
		
//                                            OR
		List<WebElement> condition=	driver.findElements(By.xpath("//input[@maxlength<=15 and @name='name' or @type='tQext']"));
		System.out.println(condition.size());

//                                           Not  
	List<WebElement> conditionsss=driver.findElements(By.xpath("//input[not(@maxlength=10)]"));	
		System.out.println(conditionsss.size());
		
		
	}
}