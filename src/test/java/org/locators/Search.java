package org.locators;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base {
	public Search() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement clkloc;

	@FindBy(id = "hotels")
	private WebElement clkhotel;

	@FindBy(id = "room_type")
	private WebElement clktype;

	@FindBy(id = "room_nos")
	private WebElement clknos;

	@FindBy(id = "adult_room")
	private WebElement clkadult;

	@FindBy(id = "child_room")
	private WebElement clkchild;

	@FindBy(id = "Submit")
	private WebElement clksubmit;

	public WebElement getClkloc() {
		return clkloc;
	}

	public WebElement getClkhotel() {
		return clkhotel;
	}

	public WebElement getClktype() {
		return clktype;
	}

	public WebElement getClknos() {
		return clknos;
	}

	public WebElement getClkadult() {
		return clkadult;
	}

	public WebElement getClkchild() {
		return clkchild;
	}

	public WebElement getClksubmit() {
		return clksubmit;
	}

	/*public void Search() {
		selectOptionByIndex(clkloc, 5);
		selectOptionByIndex(clkhotel, 2);
		selectOptionByIndex(clktype, 3);
		selectOptionByIndex(clknos, 5);
		selectOptionByIndex(clkadult, 2);
		selectOptionByIndex(clkchild, 2);
		normalClick(clksubmit);

	}
*/}
