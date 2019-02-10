package learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTables {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AK\\Project\\LearnSelenium\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String content = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		System.out.println(content); */
		
		/*driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		String content = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(content); */
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
	List col =	driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	
	System.out.println(col.size());
	
	List row =  driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	
	System.out.println(row.size());
	
	String text = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[3]")).getText();
	
	System.out.println(text);
	
			
		

	}

}
