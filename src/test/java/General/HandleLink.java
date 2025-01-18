package General;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLink {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		List<WebElement> allLink = driver.findElements(By.tagName("a"));	
	
		
		
		for(WebElement value:allLink)
		{
			
			System.out.println(value.getText());
			System.out.println(allLink.size());
			
		}	
	
	
	
	}

}
