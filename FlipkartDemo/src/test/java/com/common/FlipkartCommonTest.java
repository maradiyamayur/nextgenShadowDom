package com.common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCommonTest {
	public WebDriver driver;

	//@BeforeMethod()
	public void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\WorkSpace-2022-12\\FlipkartDemo\\src\\test\\resources\\googlechrome\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened successfully");
		driver.get(url);
		
	}

	public void switchTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void scrollDown() {
		System.out.println("Entered in scrollDown Method");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)", "");
	}
	@AfterTest
	public void quit() {
		//driver.quit();
	}

	/*
	 * public void TestTest() { // driver.close(); }
	 */
}
