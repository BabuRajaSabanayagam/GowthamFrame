package org.locators;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details extends Base {

	public Details() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtfname;

	@FindBy(id = "last_name")
	private WebElement txtlname;

	@FindBy(xpath = "//textarea[@class='txtarea']")
	private WebElement txtadd;

	@FindBy(id = "cc_num")
	private WebElement txtcc;

	@FindBy(id = "cc_type")
	private WebElement clkcctype;

	@FindBy(id = "cc_exp_month")
	private WebElement clkmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement clkyear;

	@FindBy(id = "cc_cvv")
	private WebElement txtccno;

	@FindBy(id = "book_now")
	private WebElement clkbooknow;

	@FindBy(name = "order_no")
	private WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getTxtfname() {
		return txtfname;
	}

	public WebElement getTxtlname() {
		return txtlname;
	}

	public WebElement getTxtadd() {
		return txtadd;
	}

	public WebElement getTxtcc() {
		return txtcc;
	}

	public WebElement getClkcctype() {
		return clkcctype;
	}

	public WebElement getClkmonth() {
		return clkmonth;
	}

	public WebElement getClkyear() {
		return clkyear;
	}

	public WebElement getTxtccno() {
		return txtccno;
	}

	public WebElement getClkbooknow() {
		return clkbooknow;
	}

/*	public void Details(String text, String Fname, String LName, String Address) {
		sendkeys(getTxtfname(), Fname);

		sendkeys(getTxtlname(), LName);

		sendkeys(getTxtadd(), Address);

		selectOptionByIndex(getClkcctype(), 2);

		selectOptionByIndex(getClkmonth(), 5);

		selectOptionByIndex(getClkyear(), 12);

		sendkeys(getTxtccno(), text);

		normalClick(getClkbooknow());

	}
*/}
