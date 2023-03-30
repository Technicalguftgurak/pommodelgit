package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ActitimeLoginPage;

public class Actitest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\rakesh kumar\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitly Wait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();

	}

}
