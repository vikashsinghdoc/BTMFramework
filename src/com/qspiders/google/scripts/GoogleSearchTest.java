package com.qspiders.google.scripts;

import org.testng.annotations.Test;

import com.qspiders.google.generic.BaseTest;
import com.qspiders.google.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest{
	
	@Test
	public void googleSearch() throws Throwable {
		GoogleSearchPage gsp = new GoogleSearchPage(driver);
		
		gsp.searchFor("Selenium");
	}
	
	public void printmsg() {
		System.out.println("message");
	}
	public void printmsg2() {
		System.out.println("message");
	}
	public void printmsg3() {
		System.out.println("message");
	}

}
