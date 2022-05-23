package org.browsertest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DataUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Browser {
	@Parameters({"emailId", "password"})
	@Test(dataProvider ="getData", dataProviderClass =DataUtils.class)
	public void login(String email, String password)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(password);
		driver.findElementByXPath("//a[text()='Log in']").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
		
		
		
		
		
}
}