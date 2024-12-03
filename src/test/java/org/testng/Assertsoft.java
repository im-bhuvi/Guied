package org.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertsoft {
	public static WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		 driver=new ChromeDriver();
		
		System.out.println("beforeclassC");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclassC");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethodC");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethodC");
	}
	@Test
	private void test() {
		SoftAssert s=new SoftAssert();
		driver.get("https://www.facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");  //to verify if we in correct page= verifying by url
		s.assertTrue(contains, "verify");                    //in different ways and u can see by changing boolean
		
		WebElement page = driver.findElement(By.xpath("//div[@class='_8esk']"));
		String text = page.getText();                                //to verify if we in correct page= by using words in the page
		boolean contains2 = text.contains("Create");
		s.assertTrue(contains2,"acc");
		s.assertAll();
		
	    System.out.println("testC");
	
	}
	@Test
	private void test1() {
		SoftAssert s=new SoftAssert();  
		s.assertTrue(false);            //to fail the method 
	//	s.assertAll();                  //by using this method
		System.out.println("test1");
	}
	
	@Test         
	private void test2() {
	//	Assert.assertTrue(false);        //to fail method
	System.out.println("test2");

	}
	
	@Test(enabled = false)               //to ignore
	private void test3() {
		System.out.println("test3");

	}
	

}
