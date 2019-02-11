/**
 * 
 */
package testcases;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import newSample.LoginPage;

/**
 * @author 516798
 *
 */
public class VerifyLogin 
{
 @Test
 public void ValidateLogin()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\516798\\eclipse-workspace\\NewProject\\Resources\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/mercurysignon.php");
	 LoginPage login = new  LoginPage(driver);
	 login.Logintoapplication("newuser@gmail.com","Password1");
	 driver.quit();
 }
}
