package newSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\516798\\eclipse-workspace\\NewProject\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Abishek");
		driver.findElement(By.name("lastName")).sendKeys("Raj");
		driver.findElement(By.name("phone")).sendKeys("7878787878");
		driver.findElement(By.id("userName")).sendKeys("newuser@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("ABC street");
		driver.findElement(By.name("city")).sendKeys("Chennai");
        driver.findElement(By.name("state")).sendKeys("TamilNadu");
        driver.findElement(By.name("postalCode")).sendKeys("600123");
        
        WebElement element = driver.findElement(By.name("country"));
        Select dd = new Select(element);
        dd.selectByValue("92");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("newuser04");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@name,'register')]")).click();
        		
	}

}
