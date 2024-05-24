package GTM_Project.Airline_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Easemytrip_login_page 
{
	WebDriver driver;
	 
	  @FindBy(id="txtEmail")
	   WebElement mobilenumber;
	 
	   public void email ()
	   {
		   mobilenumber.sendKeys("ishanayaz01@gmail.com" );
	   	}
	   public void wrong_number()
	   {
		   mobilenumber.sendKeys("636237822167");
	   	}
	   public boolean assertion()
	   {
		 boolean ansr=  mobilenumber.isDisplayed();
		   return ansr;
	   	}
	   
	   @FindBy(id="shwotp")
	   WebElement continuebutton;
	 
	   public void continu ()
	   {
		   continuebutton.click();
	   	}
	   
	   @FindBy(id="txtEmail2")
	   WebElement password;
		 
	   public void password ()
	   {
		   password.sendKeys("ishana@123");
	   	}
	   @FindBy(xpath="(//input[@class='_btnLogin'])[3]")
	   WebElement login;
	 
	   public void login()
	   {
		 
		   login.click();
	   	}
	   public Easemytrip_login_page(WebDriver driver)
	   {
	   	this.driver=driver;
	   	PageFactory.initElements(driver, this);
	   }

}


