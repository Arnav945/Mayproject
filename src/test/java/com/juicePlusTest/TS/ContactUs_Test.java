package com.juicePlusTest.TS;

import org.testng.annotations.Test;

import com.juicePlusTest.PO.AboutUs;
import com.juicePlusTest.PO.DriverMain;

import junit.framework.Assert;

public class ContactUs_Test extends DriverMain {

	@Test
	public void tapAboutUS() {

		AboutUs aboutUsPO = new AboutUs();
		Assert.assertEquals(aboutUsPO.tapOnAboutUS(), true);
		
		

	}
}
