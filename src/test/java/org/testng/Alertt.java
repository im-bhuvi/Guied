package org.testng;

import org.bass.Bassclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alertt extends Bassclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserlaunch("chrome");
		timesout(5);
		url("https://demo.automationtesting.in/Alerts.html");
		
		WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click(element);
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click(ele);
		WebElement element2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		click(element2);
		
		sleep(3000);
		Alert b = driver.switchTo().alert();
		String text1 = b.getText();
		System.out.println(text1);
		a.dismiss();
		
		WebElement ele2 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click(ele2);
		WebElement element3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		click(element3);
		
		sleep(3000);
		Alert c = driver.switchTo().alert();
		String text2 = c.getText();
		System.out.println(text2);
		c.sendKeys("bhuvi");
		a.accept();
	}

}
