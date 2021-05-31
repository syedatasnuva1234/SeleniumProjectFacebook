package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = Base.getDriver();
		
		 //navigating facebook.com website
		
		driver.get("http://facebook.com");
		
		//maximize browser window
		
		driver.manage().window().maximize();
		
		//print the url of the webpage
		
		String urlFromWebpage = driver.getCurrentUrl();
		
		System.out.println(urlFromWebpage);
		
 //enter email address in textfield
		  
 //FIND email address textbox
		
		WebElement element = driver.findElement(By.id("email"));
		
		//enter text in the textbox
		
		element.sendKeys("01760316747");
		
//enter password in textbox
		 
		driver.findElement(By.id("pass")).sendKeys("Ttxyzabc123#");
		
// click Login button
		
		element = driver.findElement(By.id("loginbutton"));
		
		element.click();
		
	// reload the page
		driver.navigate().refresh();
	
	
		
  }

}
