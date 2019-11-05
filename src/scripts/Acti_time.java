package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic_libraries.Auto_constant;
import generic_libraries.Genericfetchdataexcel;
import generic_libraries.Propertygeneric;
import pom.Actitime1;
import pom.Actitime2;

public class Acti_time implements Auto_constant {
    public WebDriver driver;
     @BeforeMethod
	public void openappln() throws FileNotFoundException, IOException
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		String URL=Propertygeneric.Propertygeneric(PROPERTY_PATH,"url");
		driver.get(URL);
	}
     @Test
     public  void test() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
     {
    	 Actitime1  Act=new Actitime1(driver);
    	 Thread.sleep(3000);
      	 Act.un("admin");
      	 Act.pwdbttn("manager");
      	 Act.button();
      	Actitime2 act=new Actitime2(driver);
      	act.btn();
     }
     @AfterMethod
     public void closeappln() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 
		driver.quit();
     }

}
