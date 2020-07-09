package Selenium_Browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {

		//Automating using Fitrfox
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(1000);

		driver.close();
		// driver.quit();

	}

}
