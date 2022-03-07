package org.login;

import org.base.Base;
import org.locators.Details;
import org.locators.LoginPage;
import org.locators.Search;
import org.locators.TextAndRadio;
import org.openqa.selenium.WebElement;

public class Login extends Base {

	public static void main(String[] args) throws Throwable {

		getDriver();

		UrlLaunch("https://adactinhotelapp.com/");

		LoginPage l = new LoginPage();

		WebElement txtuser = l.getTxtuser();
		String getdata = getdata("Sheet1", 1, 0);
		sendkeys(txtuser, getdata);

		WebElement txtpass = l.getTxtpass();
		String textpass = getdata("Sheet1", 1, 1);
		sendkeys(txtpass, textpass);

		WebElement btnlogin = l.getBtnlogin();
		normalClick(btnlogin);

		Search s = new Search();
		WebElement clkloc = s.getClkloc();
		normalClick(clkloc);
		selectOptionByIndex(clkloc, 5);

		WebElement clkhotel = s.getClkhotel();
		normalClick(clkhotel);
		selectOptionByIndex(clkhotel, 2);

		WebElement clktype = s.getClktype();
		normalClick(clktype);
		selectOptionByIndex(clktype, 3);

		WebElement clknos = s.getClknos();
		normalClick(clknos);
		selectOptionByIndex(clknos, 5);

		WebElement clkadult = s.getClkadult();
		normalClick(clkadult);
		selectOptionByIndex(clkadult, 2);

		WebElement clkchild = s.getClkchild();
		normalClick(clkchild);
		selectOptionByIndex(clkchild, 2);

		WebElement clksubmit = s.getClksubmit();
		normalClick(clksubmit);

		TextAndRadio t = new TextAndRadio();

		WebElement clkradio = t.getClkradio();
		normalClick(clkradio);

		WebElement clkcontinue = t.getClkcontinue();
		normalClick(clkcontinue);

		Details d = new Details();

		WebElement txtfname = d.getTxtfname();
		String getdata12 = getdata("Sheet1", 1, 2);
		sendkeys(txtfname, getdata12);

		WebElement txtlname = d.getTxtlname();
		String getdata2 = getdata("Sheet1", 1, 3);
		sendkeys(txtlname, getdata2);

		WebElement txtadd = d.getTxtadd();
		String getdata3 = getdata("Sheet1", 1, 4);
		sendkeys(txtadd, getdata3);

		WebElement txtcc = d.getTxtcc();
		String getdata4 = getdata("Sheet1", 1, 5);
		sendkeys(txtcc, getdata4);

		WebElement clkcc = d.getClkcctype();
		normalClick(clkcc);
		selectOptionByIndex(clkcc, 2);

		WebElement clkmonth = d.getClkmonth();
		normalClick(clkmonth);
		selectOptionByIndex(clkmonth, 5);

		WebElement clkyear = d.getClkyear();
		normalClick(clkyear);
		selectOptionByIndex(clkyear, 12);

		WebElement txtccno = d.getTxtccno();
		String getdata6 = getdata("Sheet1", 1, 7);
		sendkeys(txtccno, getdata6);

		WebElement clkbooknow = d.getClkbooknow();
		normalClick(clkbooknow);

	
	/*	LoginPage p = new LoginPage();
		p.LoginPage("naveen53", "C1IZAU");
		
		TextAndRadio t = new TextAndRadio();
		t.TextAndRadio();
		
		Search s = new Search();
		s.Search();
		
		Details d = new Details();
		d.Details("1234567887654321", "Babu", "Raja", "Chennai");
	}*/

}
}