package General;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get(“https://demo.guru99.com/test/delete_customer.php”);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Abhi123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		// switch the seleneium focus to alert popup
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		alt.accept();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		
	
	}

}
