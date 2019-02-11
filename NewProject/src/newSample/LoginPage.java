/**
 * 
 */
package newSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author 516798
 *
 */
public class LoginPage 
{
 WebDriver driver;
 By Username = By.name("userName");
 By Password = By.xpath("//input[@name='password']");
 By SubmitButton = By.xpath("//input[@name='login']");
 


public LoginPage(WebDriver driver)
{
	this.driver=driver;
}

public void Logintoapplication(String uname1,String pwd1)
{
	driver.findElement(Username).sendKeys(uname1);
	driver.findElement(Password).sendKeys(pwd1);
	driver.findElement(SubmitButton).click();
	
	
}
}
