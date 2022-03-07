package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		  driver.get("http://www.greenstechnologys.com/");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		  
		  WebElement txtpara =
		  driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
		  
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("arugument[0].scrollIntoView();", txtpara);
		  
		  String text = txtpara.getText(); System.out.println(text);
		 

/*		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		// Locating element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
*/	}

}
