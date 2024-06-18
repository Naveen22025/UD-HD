package com.generic.hrms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.function.Function;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileLib {


	public String Property(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/Cred");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

	public String GetExcelData(String sheet, int row, int cell) throws InvalidFormatException, IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/ExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}
	
	
	public void SelectorText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void SelectorIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void DoubleClick(WebDriver driver, WebElement target) {

		Actions a = new Actions(driver);
		a.doubleClick(target);

	}

	public void MoveElement(WebDriver driver, WebElement move) {

		Actions a = new Actions(driver);
		a.moveToElement(move);
	}

	public void Click(WebDriver driver, WebElement click) {

		Actions a = new Actions(driver);
		a.click(click);
	}

	public void ExplicitWait(WebDriver driver, Duration i, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));	

	}

	public void WindowsHandle(WebDriver driver) {

		Set<String> Allwh = driver.getWindowHandles();
		Iterator<String> it = Allwh.iterator();
		String Parentwh = it.next();
		String Childwh = it.next();
		driver.switchTo().window(Parentwh);
		driver.close();
		driver.switchTo().window(Childwh);
	}
	
	public void RobotClass() throws AWTException {
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
} 