package com.proj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	
	/*private WebDriver driver=null; */
	private HtmlUnitDriver driver=null;
	
	

	@BeforeClass
	public void testSetUp() {
		
		/*File chromeDriver = new File("/usr/lib/chromium-browser/chromedriver");
	    System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
	    driver = new ChromeDriver();*/
		
		driver = new HtmlUnitDriver();
	}
	
	@Test
	public void verifyPageTittle() {
		driver.get("http://130.211.132.38:8181/applogin/");
	    String Expectedtitle = "[Apache Tomcat/7.0.55 - Error report]";
	    String Actualtitle = driver.getTitle();
	    Assert.assertEquals(Actualtitle, Expectedtitle);
        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
