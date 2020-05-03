package com.juicePlusTest.PO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Inheriting Webdriver
public class AboutUs extends DriverMain {

	public static final WebElement AboutUsMenu = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/a"));
	public static final WebElement ContactUsDropdown = driver
			.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/ul/li[6]/a"));

	public static void waitFor() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//test

	public boolean tapOnAboutUS() {

		try {
			waitFor();
			Actions actions = new Actions(driver);
			WebElement AboutUsMenu = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/a"));
			actions.moveToElement(AboutUsMenu).perform();
			WebElement ContactUsDropdown = driver.findElement(By.xpath("//*[@id=\"desktop-topnav\"]/li[6]/ul/li[6]/a"));
			ContactUsDropdown.click();
			return true;
		} catch (Exception e) {
			return false;

		}
	}
}
