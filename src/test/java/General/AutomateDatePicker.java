package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDatePicker {

	public static void main(String[] args) 
	{
		String year="2024";
		String day="sun";
		String Month="june";
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@id='onwardCal']").)
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
	
	
	
	
	
	
	
	}

}
