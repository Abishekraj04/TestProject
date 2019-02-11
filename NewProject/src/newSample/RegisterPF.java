/**
 * 
 */
package newSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
/**
 * @author 516798
 *
 */
public class RegisterPF 
{

	@FindBy (name="firstName")
	WebElement FirstName;
	
	@FindBy (name="lastName")
	WebElement LastName;
	
	@FindBy (name="phone")
	WebElement Phone;
	
	@FindBy (how=How.NAME,using="userName")
	WebElement EmailId;
	
	@FindBy (how=How.NAME,using="address1")
	WebElement Address1;
	
	@FindBy (how=How.NAME,using="address2")
	WebElement Address2;
	
	@FindBy (how=How.NAME,using="city")
	WebElement City;
	
	@FindBy (name="state")
	WebElement State;
	
	@FindBy (name="postalCode")
	WebElement Pincode;
	
	@FindBy (name="country")
	WebElement Country;
	
	void SelectCountry()
	{
		Select dd = new Select(Country);
		dd.selectByValue("92");
	}
	
	@FindBy (name="email")
	WebElement UserName;
	
	@FindBy (name="password")
	WebElement Password;
	
	@FindBy (name="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy (how=How.NAME,using="register")
	WebElement Register;	
}	

