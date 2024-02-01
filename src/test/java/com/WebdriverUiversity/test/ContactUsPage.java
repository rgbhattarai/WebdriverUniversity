package com.WebdriverUiversity.test;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPage {

	@Test
	public void clickContactPage() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='contact-us']/div/div/h1")).click();

		Set <String> windowHandles = driver.getWindowHandles();

		Iterator<String> ii = windowHandles.iterator();

		String parent = ii.next();
		String child = ii.next();

		driver.switchTo().window(child);

		//String title = driver.getTitle();
		// System.out.println(title);
		String title= driver.findElement(By.xpath("//*[@id='contact_me']/div/div/div/h2")).getText();
		Assert.assertEquals(title,"CONTACT US" );
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rushie");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ghimire");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rushie@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	String text = driver.findElement(By.xpath("//h1")).getText();
		 Assert.assertEquals(text, "Thank You for your Message!");
		 driver.close();
		 driver.switchTo().window(parent);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='login-portal']")).click();
		//driver.quit();
		
	}
}
