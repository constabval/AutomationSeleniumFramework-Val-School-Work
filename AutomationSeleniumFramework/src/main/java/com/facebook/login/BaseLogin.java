package com.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();//upcasting polymorphism
		// Maximize browser
		driver.manage().window().maximize();
		// Open facebook
		driver.get("http://www.facebook.com");
		//email input box
	 	
		WebElement email=driver.findElement(By.xpath("//*[@type='email']"));
		email.sendKeys("constableval2@hotmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("12345678");//This password is not correct for my protection
		
		WebElement signinbtn=driver.findElement(By.xpath("//*[@value='Log In']"));
		signinbtn.click();
				
	}

	
	}


