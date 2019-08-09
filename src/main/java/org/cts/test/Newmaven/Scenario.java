package org.cts.test.Newmaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick-jk\\eclipse-workspace\\Newmaven\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://");
	
	WebElement a = driver.findElement(By.xpath(""));
	a.click();
String par = driver.getWindowHandle();
	System.out.println(par);
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	for(String x:all) {
	if(!par.equals(x)) {
		driver.switchTo().window(x);
		
	}
	driver.switchTo().frame("id");
	WebElement b = driver.findElement(By.xpath(""));
	
	String text = b.getText();
	System.out.println(text);
	
}
}
}
