package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;
	public void launchUrl(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	public void enterText(WebElement id, String text) {
		id.sendKeys(text);
	}
	public void btnclick(WebElement id) {
		id.click();
	}
	public void selectOptions(WebElement id, int index) {
		Select s = new Select(id);
		s.selectByIndex(index);
	}
	public void selectOptionsByValue(WebElement id, String value) {
		Select s = new Select(id);
		s.selectByValue(value);
	}
	public void selectOptionsByVisibleText(WebElement id, String text) {
		Select s = new Select(id);
		s.selectByVisibleText(text);
	}
	
	public void clearText(WebElement id) {
		id.clear();
	}
	public String readExcel(String sheet, int row, int column) throws IOException {
		File f = new File("C:\\Users\\Britto\\eclipse-workspace\\GreenExcerciseCucumber\\Excel\\Adactin.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(column);
		int cellType = c.getCellType();
		String data = null;
		if (cellType==1) {
			data = c.getStringCellValue();
		} else if(DateUtil.isCellDateFormatted(c)){
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
			data = sf.format(dateCellValue);
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			data = String.valueOf(l);
		}
		return data;
	}
}
