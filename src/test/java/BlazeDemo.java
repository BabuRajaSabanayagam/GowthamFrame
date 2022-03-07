import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlazeDemo {
	public static void main(String[] args) throws IOException {
		Base b = new Base();

		b.getDriver();
		b.maximize();
		b.UrlLaunch("https://blazedemo.com/");

		WebElement clkboston = b.findElementByXpath("//option[text()='Boston']");
		b.normalClick(clkboston);

		WebElement clklondon = b.findElementByXpath("//option[text()='London']");
		b.normalClick(clklondon);

		WebElement clksubmit = b.findElementByXpath("//input[@class='btn btn-primary']");
		b.normalClick(clksubmit);

		WebElement clkflight = b.findElementByXpath("(//input[@type='submit'])[3]");
		b.normalClick(clkflight);

		WebElement txtfName = b.findElementById("inputName");
		String getdata = b.getdata("Sheet1", 1, 0);
		b.sendkeys(txtfName, getdata);

		WebElement txtaddress = b.findElementById("address");
		String getdata2 = b.getdata("Sheet1", 1, 1);
		b.sendkeys(txtaddress, getdata2);

		WebElement txtcity = b.findElementById("city");
		String getdata3 = b.getdata("Sheet1", 1, 2);
		b.sendkeys(txtcity, getdata3);

		WebElement txtstate = b.findElementById("state");
		String getdata4 = b.getdata("Sheet1", 1, 3);
		b.sendkeys(txtstate, getdata4);

		WebElement txtzipcode = b.findElementById("zipCode");
		String getdata5 = b.getdata("Sheet1", 1, 4);
		b.sendkeys(txtzipcode, getdata5);

		WebElement txtcardno = b.findElementById("creditCardNumber");
		String getdata6 = b.getdata("Sheet1", 1, 5);
		b.sendkeys(txtcardno, getdata6);

		WebElement txtmonth = b.findElementById("creditCardMonth");
		String getdata7 = b.getdata("Sheet1", 1, 6);
		b.sendkeys(txtmonth, getdata7);

		WebElement txtyear = b.findElementById("creditCardYear");
		String getdata8 = b.getdata("Sheet1", 1, 7);
		b.sendkeys(txtyear, getdata8);

		WebElement txtcname = b.findElementById("nameOnCard");
		String getdata9 = b.getdata("Sheet1", 1, 8);
		b.sendkeys(txtcname, getdata9);

		WebElement btnsubmit = b.findElementByXpath("//input[@type='submit']");
		b.normalClick(btnsubmit);

		WebElement tabledate = b.findElementByClassName("table");

		List<WebElement> elements = tabledate.findElements(By.tagName("tr"));
		for (int i = 0; i < elements.size() - 6; i++) {
			WebElement element = elements.get(i);
			String text = element.getText();
			b.WriteData("sheet1", 1, 9, text);

		}

	}

}
