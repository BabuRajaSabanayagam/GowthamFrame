import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdaptinHotel {

	public static void main(String[] args) throws IOException, InterruptedException {

		Base b = new Base();

		b.getDriver();
		
		b.implicitWait(300);
		
		b.UrlLaunch("https://adactinhotelapp.com/");
	

		WebElement txtuser = b.findElementById("username");
		String getdata = b.getdata("Sheet1", 1, 0);
		b.sendkeys(txtuser, getdata);

		WebElement txtpass = b.findElementById("password");
		String getdata2 = b.getdata("Sheet1", 1, 1);

		b.sendkeys(txtpass, getdata2);
		WebElement btnlogin = b.findElementById("login");
		b.normalClick(btnlogin);

		WebElement clkloc = b.findElementById("location");
		b.normalClick(clkloc);
		b.selectOptionByIndex(clkloc, 5);

		WebElement clkhotel = b.findElementById("hotels");
		b.normalClick(clkhotel);
		b.selectOptionByIndex(clkhotel, 2);

		WebElement clktype = b.findElementById("room_type");
		b.normalClick(clktype);
		b.selectOptionByIndex(clktype, 3);

		WebElement clknos = b.findElementById("room_nos");
		b.normalClick(clknos);
		b.selectOptionByIndex(clknos, 5);

		WebElement clkadult = b.findElementById("adult_room");
		b.normalClick(clkadult);
		b.selectOptionByIndex(clkadult, 2);

		WebElement clkchild = b.findElementById("child_room");
		b.normalClick(clkchild);
		b.selectOptionByIndex(clkchild, 2);

		WebElement clksubmit = b.findElementById("Submit");
		b.normalClick(clksubmit);

		WebElement clkradio = b.findlocatorByName("radiobutton_0");
		b.normalClick(clkradio);

		WebElement clkcontinue = b.findElementById("continue");
		b.normalClick(clkcontinue);

		WebElement txtfname = b.findElementById("first_name");
		String text = b.getdata("Sheet1", 1, 6);
		b.sendkeys(txtfname, text);

		WebElement txtlname = b.findElementById("last_name");
		String getdata3 = b.getdata("Sheet1", 1, 7);
		b.sendkeys(txtlname, getdata3);

		WebElement txtaddress = b.findElementByXpath("//textarea[@class='txtarea']");
		String getdata4 = b.getdata("Sheet1", 1, 8);
		b.sendkeys(txtaddress, getdata4);

		WebElement txtcc = b.findElementById("cc_num");
		String getdata5 = b.getdata("Sheet1", 1, 9);
		b.sendkeys(txtcc, getdata5);

		WebElement clkcc = b.findElementById("cc_type");
		b.normalClick(clkcc);
		b.selectOptionByIndex(clkcc, 3);

		WebElement clkdate = b.findElementById("cc_exp_month");
		b.normalClick(clkdate);
		b.selectOptionByIndex(clkdate, 5);

		WebElement clkexp = b.findElementById("cc_exp_year");
		b.normalClick(clkexp);
		b.selectOptionByIndex(clkexp, 12);

		WebElement txtcvv = b.findElementById("cc_cvv");
		String getdata6 = b.getdata("Sheet1", 1, 10);
		b.sendkeys(txtcvv, getdata6);

		WebElement clkbook = b.findElementById("book_now");
		b.normalClick(clkbook);

		WebElement txtorderId = b.findElementById("order_no");
		String attribute = b.getAttribute(txtorderId);
		b.WriteData("Sheet1", 1, 11, attribute);
		System.out.println(attribute);

		
	}

}
