/**
 * 
 */
package newSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author 516798
 *
 */
public class LoginPageNew 
{
	
 WebDriver driver;
 
 public LoginPageNew(WebDriver driver)
 {
	 this.driver=driver;
 }
	
 @FindBy (name="userName")
 WebElement username;
 
 @FindBy (how=How.NAME,using="password")
 WebElement password;

 @FindBy (how=How.NAME,using="login")
 WebElement submitbutton;
 
 


public void logintoapplication(String uname ,String pwd )
{
	username.sendKeys(uname);
	password.sendKeys(pwd);
	submitbutton.click();
}
}