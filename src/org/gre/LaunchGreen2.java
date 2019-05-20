package org.gre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchGreen2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G://testing//Selenium day3//OneGreen//driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement e = driver.findElement(By.id("email"));
	e.sendKeys("suriyar");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("suriya");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}
}
