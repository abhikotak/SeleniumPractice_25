package General;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxUsingSelectClass {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS);
//		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
//		Select sec= new Select(year);
//		sec.selectByIndex(2);
		List<WebElement>allyear=driver.findElements(By.xpath("//select[@id='yearbox']/option"));
	
		for(WebElement value:allyear)
		{
			
			if(value.getText().equals("1932"))
			{
				
				value.click();
				break;
			}
		}	
	
	}

}
