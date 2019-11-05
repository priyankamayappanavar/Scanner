package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime2 {
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement lgout;
	
	
	public Actitime2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void btn()
	   {
		lgout.click(); 
	   }

}
