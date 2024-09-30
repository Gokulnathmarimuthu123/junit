package org.adaptin_Junit_pageclass;

import org.adaptin_Junit_Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass extends BaseClass {

	public LoginPageClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;
	

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//select[@id='location']")

	private WebElement Location;
	
	public WebElement Location() {
		return Location;
	}
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels;
	public WebElement Hotels() {
		return Hotels;
	}
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement RoomType;
	public WebElement RoomType() {
		return RoomType;
	}
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement NumberofRooms;
	public WebElement NumberofRooms() {
		return NumberofRooms;
	}
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement CheckInDate1;
	public WebElement CheckInDate1() {
		return CheckInDate1;
	}
	

	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement CheckOutDate;
	public WebElement CheckOutDate() {
		return CheckOutDate;
	}
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement AdultsperRoom;
	public WebElement AdultsperRoom() {
		return AdultsperRoom;
	}
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement ChildrenperRoom;
	public WebElement ChildrenperRoom() {
		return ChildrenperRoom;
	}
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Search;
	public WebElement Search() {
		return Search;
	}
	
	
	
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	public WebElement firstname() {
		return firstname;
	}
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	public WebElement lastname() {
		return lastname;
	}
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	public WebElement address() {
		return address;
	}
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement critedcard;
	public WebElement critedcard() {
		return critedcard;
	}
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement critedcardtype;
	public WebElement critedcardtype() {
		return critedcardtype;
	}
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement month;
	public WebElement month() {
		return month;
	}
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement year;
	public WebElement year() {
		return year;
	}
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccv;
	public WebElement ccv() {
		return ccv;
	}
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booknow;
	public WebElement booknow() {
		return booknow;
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radiobuttion;
	public WebElement radiobuttion() {
		return radiobuttion;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebuttion;
	public WebElement continuebuttion() {
		return continuebuttion;
	
	
	}
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement loginagain;
	public WebElement loginagain() {
		return loginagain;
	}
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myitinerary;
	public WebElement myitinerary() {
		return myitinerary;
	}
	@FindBy(xpath="(//input[@name=\"ids[]\"])[1]")
	private WebElement idclick;
	public WebElement idclick() {
		return idclick;
	}
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement cancle;
	public WebElement cancle() {
		return cancle;
	}
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;
	public WebElement logout() {
		return logout;
	}
	
	
	
	
	

}
