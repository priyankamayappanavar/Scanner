package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime1 {
	@FindBy(name="username")
	private WebElement usn;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement btn;
	
	public Actitime1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
   public void un(String name)
   {
	   usn.sendKeys(name); 
   }
   public void pwdbttn(String pwd1)
   {
	   pwd.sendKeys(pwd1); 
   }
   
   public void button()
   {
	   btn.click();
   }
}
