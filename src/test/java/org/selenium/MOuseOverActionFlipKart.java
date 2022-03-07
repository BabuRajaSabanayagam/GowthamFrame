package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOuseOverActionFlipKart {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		WebElement ClkX = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		ClkX.click();
		Actions action = new Actions(driver);

		WebElement ClkHome = driver.findElement(By.xpath("//div[text()='Home']"));
		action.moveToElement(ClkHome);

		WebElement movementbed = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		action.moveToElement(movementbed);

		WebElement BedBtn = driver.findElement(By.xpath("//a[text()='Beds']"));
		BedBtn.click();
		
	}
}
