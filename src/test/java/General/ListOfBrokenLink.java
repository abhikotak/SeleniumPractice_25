package General;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfBrokenLink {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 List<WebElement>lis= new ArrayList<>();
		int count=0;
		 driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> allWebElement = driver.findElements(By.tagName("a"));
		for(WebElement value:allWebElement)
		{
			
			if(value.getAttribute("href")!=null)
			{
				
				lis.add(value);
				count++;
			}
			
		}	

	System.out.println("The number of broken links are"+lis+"and the count is "+count);
	}

}
