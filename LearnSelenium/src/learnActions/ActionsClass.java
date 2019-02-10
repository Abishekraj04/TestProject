package learnActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AK\\Project\\LearnSelenium\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		  WebElement Homebutton = driver.findElement(By.linkText("REGISTER"));
		  WebElement FirstName = driver.findElement(By.name("firstName"));
		Actions act = new Actions(driver);
     Action movemouse = act.moveToElement(Homebutton).click().keyDown(FirstName, Keys.SHIFT).sendKeys(FirstName, "hello").build();
     
     movemouse.perform();
     
       
	}

}
