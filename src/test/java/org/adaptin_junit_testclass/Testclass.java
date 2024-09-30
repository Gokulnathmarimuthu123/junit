package org.adaptin_junit_testclass;

import java.io.IOException;

import org.adaptin_Junit_Baseclass.BaseClass;
import org.adaptin_Junit_pageclass.LoginPageClass;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testclass extends BaseClass {
	BaseClass baseclass = new BaseClass();

	@BeforeClass
	public static void loginpage() throws IOException {

		BaseClass.getDriver(BaseClass.readExcel(1, 1));

		BaseClass.getUrl(BaseClass.readExcel(9, 1));

	}
	
	LoginPageClass loginpage = new LoginPageClass();
	
	@Test
	public void tc01_loginpage() throws IOException, InterruptedException {
		
		WebElement userName = loginpage.getUserName();
		baseclass.SendKeys(userName, baseclass.readExcel(10,1));
		
		
		WebElement password = loginpage.getPassword();
		baseclass.SendKeys(password, baseclass.readExcel(11, 1));
		
		loginpage.getLogin().click();
		
		WebElement location = loginpage.Location();
		baseclass.Location(location, baseclass.readExcel(12, 1));
		
		WebElement Hotels = loginpage.Hotels();
		baseclass.Hotels(Hotels, baseclass.readExcel(13,1));
		
		WebElement RoomType = loginpage.RoomType();
		baseclass.RoomType(RoomType, baseclass.readExcel(14, 1));
		
		WebElement NumberofRooms = loginpage.NumberofRooms();
		baseclass.NumberofRooms(NumberofRooms, baseclass.readExcel(15,1));
		Thread.sleep(1000);
		
		WebElement CheckInDate = loginpage.CheckInDate1();
			CheckInDate.sendKeys("10/09/2024");
		//	base.CheckInDate(CheckInDate, base.readExcel(16,1));
		//	base.CheckInDate(CheckInDate, "05/09/2024");
			
			WebElement CheckOutDate = loginpage.CheckOutDate();
			CheckOutDate.sendKeys("15/09/2024");
			//base.CheckOutDate(CheckOutDate, base.readExcel(17,1));
			
			WebElement AdultsperRoom = loginpage.AdultsperRoom();
			baseclass.AdultsperRoom(AdultsperRoom, baseclass.readExcel(18, 1));
			
			WebElement ChildrenperRoom = loginpage.ChildrenperRoom();
			baseclass.ChildrenperRoom(ChildrenperRoom, baseclass.readExcel(19,1));
			
			WebElement Search = loginpage.Search();
			Search.click();
			Thread.sleep(2000);
			
			
			  WebElement radiobuttion = loginpage.radiobuttion();
			    radiobuttion.click();
			    
			    WebElement selecthotelpage = driver.findElement(By.xpath("//td[text()='Select Hotel ']"));
				if (selecthotelpage.isDisplayed()) {
					System.out.println("selecthotelpage is successfullly");
					
				}else {
					System.out.println("selecthotelpage is Error");
					
				}
				
				//WebElement text = driver.findElement(By.xpath("//td[text()=\"Select Hotel \"]"));
				//text.getText();

			
				WebElement continuebuttion = loginpage.continuebuttion();
			    continuebuttion.click();
			    
			    WebElement bookahotelpage = driver.findElement(By.xpath("//td[text()=\"Book A Hotel \"]"));
			    if (bookahotelpage.isDisplayed()) {
					System.out.println("bookahotelpage is successfullly");
					
				}else {
					System.out.println("bookahotelpage is Error");
					
				}
			    
			    
			    
			    
			    WebElement firstname =  loginpage.firstname();
			    firstname.sendKeys("gokul");
			    
			    WebElement lastname =  loginpage.lastname();
			    lastname.sendKeys("M");
			    
			    WebElement address =  loginpage.address();
			    address.sendKeys("4/171,salem,edappadi");
			    
			    WebElement critedcard =  loginpage.critedcard();
			    critedcard.sendKeys("9842287052123456");
			    
			    WebElement critedcardtype =  loginpage.critedcardtype();
			    critedcardtype.sendKeys("VISA");
			    
			    WebElement month =  loginpage.month();
			    month.sendKeys("July");
			    
			    WebElement year =  loginpage.year();
			    year.sendKeys("2020");
			    
			    WebElement ccv =  loginpage.ccv();
			    ccv.sendKeys("235");
			    
			    WebElement booknow =  loginpage.booknow();
			    booknow.click();
			    
			    Thread.sleep(7000);
			    WebElement confirmation = driver.findElement(By.xpath("//td[text()=\"Booking Confirmation \"]"));
			    if (confirmation.isDisplayed()) {
					System.out.println("confirmation is successfullly");
				}else {
					System.out.println("confirmation is Error");
					
				}
			    
			   
			    
			    WebElement myitinerary =  loginpage.myitinerary();
			    myitinerary.click();
			    
			    Thread.sleep(3000);
			    
			    
			   
			    
			    WebElement idclick =  loginpage.idclick();
			    idclick.click();
			    
			    WebElement cancle =  loginpage.cancle();
			    cancle.click();
			    
			    Thread.sleep(2000);
			    
			    baseclass.handleAlert();
			    
			    WebElement logout =  loginpage.logout();
			    logout.click();
			    
			    
			    
			    WebElement loginagain =  loginpage.loginagain();
			    loginagain.click();
			    
			   driver.close();
			
			
			
			
		}
			 
	

}
