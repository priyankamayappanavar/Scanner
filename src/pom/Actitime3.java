package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime3 {
	@FindBy(xpath="//span[.='Help & Support']")
	private WebElement hp;
	
	@FindBy(xpath="(//div[@onmouseover='highlight(this)'])[9]")
	private WebElement abtacti;
	
	@FindBy(xpath="//img[@align='right']")
	private WebElement cross;
	
	public Actitime3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void help()
	{
		hp.click();
	}
	
	public void about()
	{
		abtacti.click();
	}
	
	public void close()
	{
		cross.click();
	}
	
	 

}
