package com.facebook.login;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ZooplaLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
		System.out.println(driver.getTitle());//Home page
		
		driver.findElement(By.xpath("(//*[@type='button'])[2] ")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());//Login page
		
		driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']")).click();

		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("constableval@gmail.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Couva1967!");
		
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
				
		System.out.println(driver.getTitle());
	}



	}


