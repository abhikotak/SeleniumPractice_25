package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass 
{
@FindBy(xpath="")private WebElement username;
@FindBy(xpath="")private WebElement password;
@FindBy(xpath="")private WebElement submit;

public POMClass(WebDriver driver)

{
	
PageFactory.initElements(driver, this);


}
public void getUSername()
{
	
username.sendKeys("Abhi");


}
public void getPassword()
{
	
password.sendKeys("1234");

}

public void btn_click()
{
	
submit.click();

}



}
