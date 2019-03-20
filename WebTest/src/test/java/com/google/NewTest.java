package com.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
	
	  @Test
	  public void test() {	
		  driver.get("https://gmail.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.id("identifierId")).sendKeys("biswajit.biswal@visnet.in");
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		  
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\VISNET\\Library\\lib\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		  
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
