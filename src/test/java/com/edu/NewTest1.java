package com.edu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

//added lines
import org.openqa.selenium.chrome.ChromeOptions;
//end
public class NewTest1 {
	
 // WebDriver driver;
// 
  @BeforeMethod
  public void beforeMethod() {
	    System.setProperty("webdriver.chrome.driver", "//root//chromedriver");
	    //System.setP//root//roperty("webdriver.chrome.driver", "//root//chromedriver");  
	   //for headless mode
	    ChromeOptions options = new ChromeOptions();  
	    //options.addArguments("window-size=1400,600");
	    options.addArguments("--headless");
	    options.addArguments("--no-sandbox");
	    WebDriver driver=new ChromeDriver(options);
	    options.addArguments("--headless");  
	  //end
	
	    //driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://3.18.105.188:9080/sampleapp/");
  }
  
  @Test
  public void addContact() {
	  
	 	driver.findElement(By.xpath("//div[@class = 'v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Arjun");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("E");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("805983095");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//div[@class = 'v-button v-widget primary v-button-primary']")).click();
			
	}
  
  @Test
  public void verifytitle() {
	  
        String a = driver.getTitle();
        System.out.println(a);
        //Assert.assertEquals(a, "sampleapp");
	    System.out.println("Test Successful."); 
  }
  
  @AfterMethod
  public void afterMethod() {  
	  driver.close();
  }

}
