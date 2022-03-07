package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtlogin = driver.findElement(By.id("email"));
		txtlogin.sendKeys("babu");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("raja");
		
		WebElement btnlog = driver.findElement(By.name("login"));
		btnlog.click();		
		
		
	}

}
