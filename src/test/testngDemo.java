package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngDemo {

	SoftAssert softAsserts = new SoftAssert();

	@Test(groups = { "group1" })
	public void testMethod1() {
		System.out.println("testmethod1");
		Assert.assertEquals("false", "fualse");
		System.out.println("end testmethod1");
	}

	@Test(groups = { "group2" })
	public void testMethod2() {
		System.out.println("testmethod2");
		softAsserts.assertEquals("true", "truee");
		System.out.println("end testmethod2");
		softAsserts.assertAll();
	}
}
