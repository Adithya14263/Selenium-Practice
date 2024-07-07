package MavenPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
/*	                                              How to find elements in a webpage	using javascriptExecutor
using elements 
Id
Name
Class
Tagename
Css selector
path			                                                                                   
		*/            //                           
	                                                  	//        Method--->1        How to enter text into a textbox using javascriptExecutor
		
		driver.get("https://login.salesforce.com/?locale=in");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;		
	/*	WebElement element = 	(WebElement) jsExecutor.executeScript(" return document.getElementsByName('username')[0]; ");
			 element.sendKeys(" Name");
			 
		WebElement elements =	(WebElement) jsExecutor.executeScript("return document.getElementById('username')");
			elements.sendKeys("id");
			*/
		                                                                           // method---->2
			jsExecutor.executeScript("document.getElementById('username').value='id' ");
			Thread.sleep(2000);
			jsExecutor.executeScript("document.getElementsByName('username')[0].value='name' ");
			Thread.sleep(2000);
			jsExecutor.executeScript("document.getElementsByTagName('input')[18].value='tagename' ");
			Thread.sleep(2000);	
			jsExecutor.executeScript("document.getElementsByTagName('input')[18].value='tagename' ");
			Thread.sleep(2000);
			jsExecutor.executeScript("document.querySelector('#username').value='cssSelector' ");
			Thread.sleep(2000);
	//		jsExecutor.executeScript("document.evalute(\"//input[@id='username']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;' ");
			
			                                              // How to Highlight Web Element using  javascriptExecutor 
			
			jsExecutor.executeScript("document.getElementById('username').style.border='2px red solid' ");
			Thread.sleep(2000);
			jsExecutor.executeScript("document.getElementById('username').style.background='yellow' ");
			Thread.sleep(2000);
			jsExecutor.executeScript("document.getElementById('password').setAttribute('style','border:2px blue solid;background: orange') ");
			Thread.sleep(2000);
		//                             	 How to perform click operation using javascriptExecutor
			jsExecutor.executeScript("document.getElementById('Login').click() ");
			
			
			
	}

}
