package org.Junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingExcel {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Before
	public void beforemethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}

	@After
	public void aftermethod() {
		long end = System.currentTimeMillis();
		System.out.println(end);
	}

	@Test
	public void ts01() throws IOException {

		WebElement txtuser = driver.findElement(By.id("username"));

		String res = null;
		File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameWork\\Excel\\Blaze.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
				res = dateformat.format(dateformat);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal num = BigDecimal.valueOf(d);
				res = num.toString();
			}
		default:
			break;
		}
		txtuser.sendKeys(res);
		return;

	}

	@Test
	public void ts02() throws IOException {
		WebElement txtpass = driver.findElement(By.id("password"));

		String res = null;
		File file = new File("C:\\Users\\user\\eclipse-workspace\\FrameWork\\Excel\\Blaze.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
				res = dateformat.format(dateformat);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal num = BigDecimal.valueOf(d);
				res = num.toString();
			}
		default:
			break;

		}
		txtpass.sendKeys(res);
		return;

	}

	@Test
	public void ts03() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

}
