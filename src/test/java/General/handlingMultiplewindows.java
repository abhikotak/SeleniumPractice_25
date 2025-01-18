package General;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultiplewindows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		driver.get("https://www.orangehrm.com/");
		WebElement facebookLogo = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
		WebElement linkedin = driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
		js.executeScript("arguments[0].scrollIntoView(true)", facebookLogo);
		//driver.execute_script("arguments[0].scrollIntoView(true);", facebookLogo);
	
		js.executeScript("arguments[0].click()", facebookLogo);
		js.executeScript("arguments[0].click();", linkedin);
	
	
		Set<String> ls = driver.getWindowHandles();
		ArrayList<String >al= new ArrayList<String>(ls);
		
		for(String windowID:al)
		{
			
			String title=driver.switchTo().window(windowID).getTitle();
			
			System.out.println(title);
			if(title.equalsIgnoreCase("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook"));
			driver.switchTo().window("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook");
		}	
		
	}

}
