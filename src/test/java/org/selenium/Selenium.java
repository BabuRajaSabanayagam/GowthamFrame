package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));
		
		driver.get("https://www.instagram.com/");
		
		WebElement txtUser = driver.findElement(By.name("username"));
		txtUser.sendKeys("8668064922");
		
		WebElement txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys("password");
		
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		btnclick.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	}
