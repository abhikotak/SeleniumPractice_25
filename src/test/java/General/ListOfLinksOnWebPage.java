package General;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfLinksOnWebPage {

	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath(“//input[@name=’NewTab’]”)).click();
		List<WebElement>allLink=driver.findElements(By.xpath("//a"));
		int size=allLink.size();

		for(WebElement value:allLink)
		{
			
			System.out.println(value.getText());
			
		}	
	
	
	
	}

}
