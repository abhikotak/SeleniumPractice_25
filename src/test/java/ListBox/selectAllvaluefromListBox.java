package ListBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import General.JavascriptExecuter;

public class selectAllvaluefromListBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		 WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		 Select sec= new Select(year);
		 
		List<WebElement> ls = sec.getOptions();
		 ArrayList<WebElement>al= new ArrayList();
		 for( WebElement value:ls)
		 {
			 if(value.getText().equalsIgnoreCase("2012"))
			 {
				 
				 value.click();
				 break;
			 }	 
			 
			 
		 }	 
		 for( WebElement value:ls)
		 {
			 al.add(value);
		 }	 
		
	
	
	
	}

}
