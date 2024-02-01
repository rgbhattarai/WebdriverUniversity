package com.WebdriverUiversity.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonClick {

	@Test
	public void buttonClick() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		//driver.wait().im

//		driver.findElement(By.xpath("//span[@id='button1']")).click();
//		
//		
//		// using javascript to click
//		
//		Thread.sleep(2000);
//		WebElement element=driver.findElement(By.cssSelector("#button2"));
//
//		 
//		
//		JavascriptExecutor script = (JavascriptExecutor) driver;
//		script.executeScript("arguments[0].click()", element);
//		// using Action class
		
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.cssSelector("#button3"));
		
		Actions action = new Actions (driver);
		
		action.click(element2).build().perform();
	}
}
