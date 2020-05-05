package com.login.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {

	/// http://automationpractice.com/index.php
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser
		
		WebDriver driver=new ChromeDriver();//upcasting polymorphism
		// Maximize browser
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait 
		
		driver.get("http://automationpractice.com/index.php");
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.navigate().refresh();driver.navigate())
		
		//WebElement userName = driver.findElement(By.xpath("//*[@class='login']"));
		//userName.sendKeys("constableval");
		
		//*[@class='login'] and click
		
		System.out.println(driver.getTitle());
		
		WebElement signBtn = driver.findElement(By.xpath("//*[@class='login']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", signBtn);
		
		signBtn.click();
		System.out.println(driver.getTitle());//Login page
		signBtn.click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
