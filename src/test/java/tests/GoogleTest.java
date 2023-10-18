package tests;

import org.testng.annotations.Test;

import base.BaseClass;

public class GoogleTest extends BaseClass{
	
	@Test
	public void googleTestMehod() {
		getDriver();
		driver.get("http://www.yahoo.com");
		
	}

}
