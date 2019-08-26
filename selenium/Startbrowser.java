import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Startbrowser {

	public static void main(String[] args) {
		//to start browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//to start the web application
			driver.get("https://www.facebook.com");

	}

}
