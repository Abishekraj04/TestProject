/**
 * 
 */
package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import newSample.LoginPageNew;
import util1.Browserdetails;



/**
 * @author 516798
 *
 */
public class VerifyLogin1 
{
	@Test
	public void ValidateLogin()
	{
	
	WebDriver driver = Browserdetails.SelectBrowserandUrl("chrome","http://newtours.demoaut.com/mercurysignon.php");
	LoginPageNew login = PageFactory.initElements(driver, LoginPageNew.class);
	login.logintoapplication("newuser@gmail.com","Password1");
}
	
}
