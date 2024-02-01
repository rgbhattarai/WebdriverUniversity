package com.WebdriverUiversity.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TodoList {
	
	@Test
	public void toDoList() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		 element.sendKeys("To Eat pizza");
		 element.sendKeys(Keys.ENTER);
		 
		// element.sendKeys(Keys.DELETE);
		 
	WebElement list = driver.findElement(By.xpath("//ul/li[4]"));
	list.click();
	
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	WebElement list1 = driver.findElement(By.xpath("//ul/li[@class='completed']//i[@class='fa fa-trash']"));
	action.moveToElement(list1).click().build().perform();
	


	}
}