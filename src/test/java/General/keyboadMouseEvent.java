package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboadMouseEvent
{
@Test
public void openBrowser()
	
	{
		WebDriver driver = new ChromeDriver();
		//driver.get(“https://demo.guru99.com/test/delete_customer.php”);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
		//Actions act= new Actions(driver);
		//act.moveToElement(login).contextClick().build().perform();
		
		
	}

}
