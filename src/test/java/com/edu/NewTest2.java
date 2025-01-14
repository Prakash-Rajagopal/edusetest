package com.edu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
        ChromeOptions options;
  @BeforeMethod
  public void launch() {
	  
	    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	    options = new ChromeOptions();
	    options.addArguments("--headless");
	    options.addArguments("--no-sandbox");
	    //options.add_argument("--disable-setuid-sandbox");
	    driver = new ChromeDriver(options);
	    options.addArguments("--headless");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://facebook.com");

	  }
  
  @Test
  public void verifyurl() {
	  
	    String x = driver.getCurrentUrl();
	    System.out.println(x);
	    //Assert.assertEquals(x, "https://www.facebook.com/");
  }
  
  @Test
  public void verifytitle() {
	  
        String a = driver.getTitle();
        System.out.println(a);
        //Assert.assertEquals(a, "Facebook");
	//System.out.println("Test Successful.");    
  }
  
  @AfterMethod
  public void close() {
	  
	  driver.close();
  }

}
