package com.generic.hrms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.hrms.pom.LoginPage;

public class BaseClass {

public WebDriver driver;
public FileLib f = new FileLib();

@BeforeClass()
public void OpenBrowser() {
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterClass()
public void CloseBrowser() {
	
	//driver.close();
}

@BeforeMethod()
public void LoginApp() throws IOException {
	
	String url = f.Property("url");
	driver.get(url);
	String UN = f.Property("un");
	String PWD = f.Property("pwd");
	LoginPage l = new LoginPage(driver);
	l.SetLogin(UN, PWD);
}

@AfterMethod()
public void LogoutApp() {
	
}
}
