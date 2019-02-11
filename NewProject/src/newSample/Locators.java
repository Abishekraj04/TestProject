package newSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\516798\\eclipse-workspace\\NewProject\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.facebook.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        driver.findElement(By.cssSelector("input#email")).sendKeys("8939223912");
      
	}

}
