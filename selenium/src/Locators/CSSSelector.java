package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

		public static void main(String[] args) throws InterruptedException {
			//to start browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//to start the web application
			driver.get("http://hasee-pc:8080/login.do");
			//to enter the user name
			driver.findElement(By.name("username")).sendKeys("admin");
			//to enter the password
			driver.findElement(By.name("pwd")).sendKeys("manager");
			// to click on the login button 
			driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		}



	}


