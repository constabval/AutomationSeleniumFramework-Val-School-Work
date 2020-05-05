package com.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		WebElement userName = driver.findElement(By.xpath("//*[@name='userName']"));
		userName.sendKeys("constableval");

		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("Couva1967!");

		WebElement login = driver.findElement(By.xpath("//*[@value='Login']"));
		login.click();

		WebElement logins = driver.findElement(By.xpath("//*[@name='login']"));
		logins.click();
}

}
