package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMBaseClass {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		POMClass pom = new POMClass(driver);
		pom.getUSername();
		pom.getPassword();

	}

}
