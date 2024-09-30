package org.adaptin_Junit_Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public static WebDriver driver;
	public static Actions actions;
	public static JavascriptExecutor javascriptExecutor;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		default:
			System.out.println("Invalid Browser_Type");
			break;
		}
		}
	
	public static String readExcel (int rownum,int cellnum) throws IOException {
		
		File file = new File("C:\\Users\\BHARATHIRAJA\\eclipse-workspace\\AdactinHotel\\Database\\FW.xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileinputstream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/mm/yyy");
				 value = simpledateformat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				 value = valueOf.toString();
			}
			break;

		default:
			System.out.println("In valid call Type");
			break;
		}
		
		return value;
	}
	

	public static void getUrl(String url) {

		driver.get(url);
	}
	public void SendKeys(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}

/*	public void passWord(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}*/
	public void login(WebElement element) {
		element.click();
	}
	public void Location(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void Hotels(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void RoomType (WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void NumberofRooms(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void CheckInDate(WebElement element,String keysToSend) {

		//element.sendKeys(keysToSend);
	}
	public void CheckOutDate(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void AdultsperRoom(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void ChildrenperRoom (WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void Search (WebElement element) {
		element.click();
	}
	private void radiobuttion(WebElement element) {
		element.click();

	}
	private void continuebuttion(WebElement element) {
		element.click();

	}
	public void firstname(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void lasttname(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void address(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void critedcardtype(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void critedcard(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void month(WebElement element) {
		element.click();
	}
	public void year(WebElement element) {
	element.click();
	}
	public void ccv(WebElement element,String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void booknow(WebElement element) {
		element.click();
	}
//	private void searchbox(WebElement element) {
	//	javascriptExecutor = (JavascriptExecutor) driver;
		//Object executeScript = javascriptExecutor.executeScript("arguments[0].getAttribute('value')", element);
	//}

	public void myitinerary(WebElement element) {
		element.click();
	}
	public void idclick(WebElement element) {
		element.click();
	}
	public void cancle(WebElement element) {
		element.click();
	}
	public void logout(WebElement element) {
		element.click();
	}
	public void loginagain(WebElement element) {
		element.click();
	}
	public void handleAlert() {

		Alert alert = driver.switchTo().alert();

		alert.accept();
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs =  ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,new File("C:\\Users\\BHARATHIRAJA\\eclipse-workspace\\BaseClass\\image\\"+ System.currentTimeMillis() +".png"));
		
	}
	
	
	
	
	

}
