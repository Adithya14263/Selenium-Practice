package RelativeXpath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars {
	public static WebDriver  driver;
	public static void main(String[] args) throws ParseException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// firstDay();
		// Thread.sleep(2000);
		secondDate();

		// Feature of targetDate
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		String targetDate = "19/07/2021";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat targetDateformat = new SimpleDateFormat("dd/MM/yyyy");
		Date formatTargetDate = targetDateformat.parse(targetDate);
		calendar.setTime(formatTargetDate);
		int targetMonth = calendar.get(calendar.MONTH);
		int targetyear = calendar.get(calendar.YEAR);
		int targetDay = calendar.get(calendar.DAY_OF_MONTH);
		System.out.println(targetDate);
		Thread.sleep(3000);

		// Current MOnthOfDATE YearOfMonth
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		String currentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(currentDate); //
		SimpleDateFormat currentDateformat = new SimpleDateFormat("MMM yyyy");
		Date formatCurrentDate = currentDateformat.parse(currentDate);
		calendar.setTime(formatCurrentDate);
		int currentMonth = calendar.get(calendar.MONTH);
		int currentyear = calendar.get(calendar.YEAR);

		while (currentMonth < targetMonth || currentyear < targetyear) {
			// driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
			driver.findElement(By.xpath("//span[.='Next']")).click();
			currentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(currentDate);
			currentDateformat = new SimpleDateFormat("MMM yyyy");
			formatCurrentDate = currentDateformat.parse(currentDate);
			calendar.setTime(formatCurrentDate);
			currentMonth = calendar.get(calendar.MONTH);
			currentyear = calendar.get(calendar.YEAR);
		}

		if (currentMonth == targetMonth || currentyear == targetyear) {
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//child::td/a[.=" + targetDay + "]"))
					.click();
			System.out.println("Today your Birthday");
		} else {
			System.out.println("this is error");
		}

		// PastTargetDate
		/*
		 * while(currentMonth > targetMonth || currentyear > targetyear ){
		 * //driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		 * driver.findElement(By.xpath("//span[.='Prev']")).click(); currentDate =
		 * driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()
		 * ; System.out.println(currentDate); currentDateformat = new
		 * SimpleDateFormat("MMM yyyy"); formatCurrentDate =
		 * currentDateformat.parse(currentDate); calendar.setTime(formatCurrentDate);
		 * currentMonth = calendar.get(calendar.MONTH); currentyear =
		 * calendar.get(calendar.YEAR); }
		 * 
		 * if(currentMonth == targetMonth || currentyear == targetyear) {
		 * driver.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//child::td/a[.="+targetDay+"]")).
		 * click(); System.out.println("Today your Birthday"); } else {
		 * System.out.println("this is error"); }
		 * 
		 * 
		 */
	}

	public static void firstDay() throws InterruptedException {
		int day = 10;
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//child::td/a[.=" + day + "]")).click();

	}

	public static void secondDate() throws InterruptedException {
		int day = 20;
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//table[@class='ui-datepicker-calendar']//child::td[not(contains(@class,'ui-datepicker-other-month '))]/descendant::a[.="
						+ day + "]"))
				.click();

	}

}