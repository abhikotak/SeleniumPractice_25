package General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllListBoxElement {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");

			 WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
			 Select sc = new Select(year);
			 List<WebElement> allYear = sc.getOptions();
			 ArrayList ar= new ArrayList();
			 ArrayList ar1= new ArrayList();
			 for(WebElement value:allYear)
			 {
				 ar.add(value);
				 
				 
			 }		 
		
			Collections.sort(ar);
	}

}
