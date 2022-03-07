package org.fb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelInsertValue {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement DropDown = driver.findElement(By.id("Skills"));
		Select s = new Select(DropDown);
		List<WebElement> list = s.getOptions();

		File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameWork\\Excel\\test.xlsx");

		Workbook workbook = new XSSFWorkbook();

		Sheet Sheet = workbook.createSheet("test");

		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			Row row = Sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
		}
	}
