package automation;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = Base.getDriver();
		
		//navigate Website
		
		driver.get("http://gmail.com");
	}

}
