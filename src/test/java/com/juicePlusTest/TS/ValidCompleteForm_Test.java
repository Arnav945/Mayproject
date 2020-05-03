package com.juicePlusTest.TS;

import org.testng.annotations.Test;

import com.juicePlusTest.PO.ContactUs;

import junit.framework.Assert;

public class ValidCompleteForm_Test {
	@Test
	public void submitValidForm() {

		ContactUs contactUsPO = new ContactUs();
		Assert.assertEquals(contactUsPO.fillCompleteForm("satya", "swain", "satya@email.com", "91919191",
				"test address one", "Tennessee", "test message", "38017"), true);

	}

	@Test
	public void verifyValidSuccessMsg() throws Exception {

		ContactUs contactUsPO = new ContactUs();

		// contactUsPO.verifySucessMsg();

		//System.out.println("success msg found is " + contactUsPO.verifySucessMsg());

		Assert.assertEquals(contactUsPO.verifySucessMsg(), "Thank you! We have received your message.");

	}
}
