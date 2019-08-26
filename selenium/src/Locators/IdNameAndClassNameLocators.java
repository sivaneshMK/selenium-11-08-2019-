package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameAndClassNameLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
					//to start browser
					WebDriver driver= new ChromeDriver();
					//to start the web application
					driver.get("https://www.facebook.com");
					//to enter the first name
					driver.findElement(By.name("firstname")).sendKeys("sivanesh");
					//to enter the last name
					driver.findElement(By.name("lastname")).sendKeys("siva");
					//to enter the user name
					driver.findElement(By.className("inputtext")).sendKeys("Password");
					//to enter the password
					driver.findElement(By.id("pass")).sendKeys("sivanesh");
					//to click on the login button
					driver.findElement(By.id("loginbutton")).click();
					
	
	}

}
