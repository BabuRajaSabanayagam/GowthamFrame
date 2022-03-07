package org.locators;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextAndRadio extends Base {

	public TextAndRadio() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "radiobutton_0")
	private WebElement clkradio;

	@FindBy(id = "continue")
	private WebElement clkcontinue;

	public WebElement getClkradio() {
		return clkradio;
	}

	public WebElement getClkcontinue() {
		return clkcontinue;
	}

	/*public void TextAndRadio() {

		
		normalClick(clkradio);
		normalClick(clkcontinue);
	}
*/
}
