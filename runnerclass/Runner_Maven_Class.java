package com.runnerclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Maven_Class {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karti\\eclipse-workspace\\Mavan_Class1\\ChromeDriver\\chromedriver.exe");
	
	
	WebDriver project2 = new ChromeDriver();
	project2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	project2.get("http://adactinhotelapp.com/");
	project2.manage().window().maximize();
	project2.findElement(By.id("username")).sendKeys("karthick123456");
	project2.findElement(By.id("password")).sendKeys("Adactin*123");
	project2.findElement(By.id("login")).click();
	WebElement location = project2.findElement(By.id("location"));
	Select s = new Select(location);	
	s.selectByValue("Paris");
	WebElement hotels = project2.findElement(By.id("hotels"));
	Select q = new Select(hotels);
	q.selectByValue("Hotel Cornice");
	WebElement room = project2.findElement(By.id("room_type"));
	Select r = new Select(room);
	r.selectByValue("Super Deluxe");
	WebElement room_n = project2.findElement(By.id("room_nos"));
	Select t = new Select(room_n); 
	t.selectByValue("8");
	project2.findElement(By.id("datepick_in")).sendKeys("25/08/2022");
	project2.findElement(By.id("datepick_out")).sendKeys("30/08/2022");
	WebElement adult = project2.findElement(By.id("adult_room"));
	Select u = new Select(adult);
	u.selectByValue("1");
	WebElement child = project2.findElement(By.id("child_room"));
	Select v = new Select(child);
	v.selectByVisibleText("0 - None");
	project2.findElement(By.id("Submit")).click();
	project2.findElement(By.id("radiobutton_0")).click();
	project2.findElement(By.id("continue")).click();
	project2.findElement(By.id("first_name")).sendKeys("Karthick");
	project2.findElement(By.id("last_name")).sendKeys("SSSSS");
	project2.findElement(By.id("address")).sendKeys("123 vadapalani");
	project2.findElement(By.id("cc_num")).sendKeys("1234567891011121");
	WebElement cctype = project2.findElement(By.id("cc_type"));
	Select w = new Select(cctype);
	w.selectByValue("VISA");
	WebElement ccmonth = project2.findElement(By.id("cc_exp_month"));
	Select m = new Select(ccmonth);
	m.selectByValue("4");
	WebElement ccyear = project2.findElement(By.id("cc_exp_year"));
	Select z = new Select(ccyear);
	z.selectByValue("2022");
	project2.findElement(By.id("cc_cvv")).sendKeys("987");
	project2.findElement(By.id("book_now")).click();
	project2.findElement(By.id("my_itinerary")).click();
	project2.findElement(By.id("logout")).click();

}	
	

}
