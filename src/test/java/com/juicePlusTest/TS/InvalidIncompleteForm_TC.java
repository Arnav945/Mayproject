package com.juicePlusTest.TS;

import org.testng.annotations.Test;

import com.juicePlusTest.PO.ContactUs;
import com.juicePlusTest.PO.DriverMain;

import junit.framework.Assert;

public class InvalidIncompleteForm_TC extends DriverMain {

	@Test
	public void submitInvalidForm() {

		ContactUs contactUs = new ContactUs();

		Assert.assertEquals(contactUs.fillIncompleteForm("satya", "swain", "satya@email.com", "9191919191"), true);

	}

	@Test
	public void verifyInvalidFormError() {

		ContactUs contactUsPO = new ContactUs();
		String errorText = contactUsPO.InvalidError();
		System.out.println("errr text found is " + errorText);
		Assert.assertEquals(errorText, "Thank you! We have received your message.");

	}
}
