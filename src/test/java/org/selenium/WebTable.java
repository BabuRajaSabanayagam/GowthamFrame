package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/table.html");

		WebElement findElement = driver.findElement(By.xpath("//table[@border='1']"));

		List<WebElement> findElements = findElement.findElements(By.tagName("tbody"));

		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);

			List<WebElement> findElements2 = webElement.findElements(By.tagName("tr"));
			for (int j = 0; j < findElements2.size(); j++) {

				WebElement webElement2 = findElements2.get(j);
				String text = webElement2.getText();
				if (text.equals(3)) {
					System.out.println(text);
				}

			}
			/*
			 * String text = webElement.getText(); System.out.println(text);
			 */
		}

	}
}
