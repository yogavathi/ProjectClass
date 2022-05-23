package org.browsertest;


	
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BrowserLaunch {
		@Test
		private void frameHandling() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Yoga");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("S");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("s.yogavathi@yahoo.co.in");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9004365177");
		WebElement button = driver.findElement(By.xpath("//input[@value='FeMale']"));
		button.click();
		
	}
}


