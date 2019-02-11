package util1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserdetails 
{
	
	  static WebDriver driver;
	 
	 public static WebDriver SelectBrowserandUrl(String browsername,String url)
	 {
	  if(browsername.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\516798\\eclipse-workspace\\NewProject\\Resources\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browsername.equalsIgnoreCase("IE"))
	  {
		  driver = new InternetExplorerDriver();
	  }
	  
	  driver.get(url);
	  return driver;
	  
	 }
	
}
