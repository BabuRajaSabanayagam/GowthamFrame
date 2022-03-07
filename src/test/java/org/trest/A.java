package org.trest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.base.Base;
import org.locators.Details;
import org.locators.LoginPage;
import org.locators.Search;
import org.locators.TextAndRadio;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A extends Base {
	LoginPage l;

	@BeforeClass
	private void beforeclass() {

		getDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@BeforeMethod
	private void beforeMethod() {

		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	private void afterMethod(Method m) throws IOException {

		Date d = new Date();
		System.out.println(d);

		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, new File(m.getName() + ".png"));
	}

	@Parameters({ "txtuser", "txtpass" })
	@Test
	private void tc0(String s, String s1) {
		l = new LoginPage();

		sendkeys(l.getTxtuser(), s);
		sendkeys(l.getTxtpass(), s1);

		normalClick(l.getBtnlogin());

	}

	@Test
	private void tc02() {
		Search s = new Search();

		selectOptionByIndex(s.getClkloc(), 5);
		selectOptionByIndex(s.getClkhotel(), 2);
		selectOptionByIndex(s.getClktype(), 3);
		selectOptionByIndex(s.getClknos(), 5);
		selectOptionByIndex(s.getClkadult(), 2);
		selectOptionByIndex(s.getClkchild(), 2);
		normalClick(s.getClksubmit());

	}

	@Parameters({ "FirstName", "LastName", "Add", "CCno", "cc" })
	@Test
	private void tc03(String s, String s1, String s2, String s3, String s4) {

		TextAndRadio r = new TextAndRadio();

		normalClick(r.getClkradio());
		normalClick(r.getClkcontinue());
		Details d = new Details();

		sendkeys(d.getTxtfname(), s);
		sendkeys(d.getTxtlname(), s1);
		sendkeys(d.getTxtadd(), s3);
		selectOptionByIndex(d.getClkcctype(), 2);
		sendkeys(d.getTxtcc(), s3);
		selectOptionByIndex(d.getClkmonth(), 5);
		selectOptionByIndex(d.getClkyear(), 12);
		sendkeys(d.getTxtccno(), s4);
		normalClick(d.getClkbooknow());

	}

}
