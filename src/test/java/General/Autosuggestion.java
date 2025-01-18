package General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Autosuggestion {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("button")));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("pawan");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung ");
		

	}

}
