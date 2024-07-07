package MavenPractice;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(" https://www.facebook.com/login/");
		
		     //              notebook
//		Id--->         document.getElementById('email');
//		Name--->  document.getElementsByName('email')[0];
//		TageName---->  document.getElementsByTagName('input')[13];
//		Css selector --->   document.querySelector('#pass');
//		Xpath ----->    sysntex --->       document.evaluate(xpathExpersion,contextNode,namespaceResolver,resultType,result).singleNodeValue
//		document.evaluate("//input[@name='pass']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;

                              //	 how to find elements in a webpage	using javascriptExecutor
		                                             
		
		//                              method---->1
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	/*WebElement element = 	(WebElement) jsExecutor.executeScript(" return document.getElementsByName('email')[0] ");
		 element.sendKeys(" Name");
	//	 System.out.println(getAttribute("value"));  
		 *  */
		 
		
		
		
	jsExecutor.executeScript("document.getElementById('email').style.border='2px green solid '");
	
	jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border :2px yellow solid ;background: orange')");
		
		jsExecutor.executeScript("document.getElementById('pass').style.background= 'red';");
/*		
	//method-->2           How to enter text into a textbox using javascriptExecutor
		
	jsExecutor .executeScript(" document.getElementById('email').value='Id'; ");
	Thread.sleep(2000);
	jsExecutor .executeScript(" document.getElementsByName('email')[0].value='Name'; ");
	Thread.sleep(2000);
	jsExecutor .executeScript("  document.getElementsByTagName('input')[13]. value='TageName' ; ");
	Thread.sleep(2000);
	jsExecutor .executeScript(" document.querySelector('#pass'). value='Css' ; ");
	Thread.sleep(2000);    */
//	jsExecutor .executeScript("  document.evaluate(\"//input[@name='pass']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;. value='xpath' ; ");
	
	
	//    How to perform click operation using javascriptExecutor
	
	//	jsExecutor.executeScript("document.getElementsByName('login')[0].click()");
		
	
		
		
	}

}
