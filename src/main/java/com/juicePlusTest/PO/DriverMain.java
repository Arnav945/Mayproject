package com.juicePlusTest.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverMain {

	// Define web launch
	public static WebDriver driver;

	@BeforeTest
	public void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RetailAdmin\\eclipse-workspace\\JuicePlusDemo\\src\\test\\java\\com\\demo\\JuicePlusDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.quit();
		driver.manage().window().maximize();
		driver.get("https://www.juiceplus.com");
	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

}
