package GTM_Project.Airline_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class easemytrip_registration_page {

	
	WebDriver driver;
 
	  @FindBy(id="txtEmail")
	   WebElement email;
	 
	   public void mobile_number ()
	   {
		   email.sendKeys("ishanayaz01@gmail.com");
	   	}
	   
	   @FindBy(id="shwotp")
	   WebElement continuebutton;
	 
	   public void continu ()
	   {
		   continuebutton.click();
	   	}
	   @FindBy(id="OtpLgnBtn")
	   WebElement createaccount;
	 
	   public void createaccount()
	   {
		   createaccount.click();
	   	}
	   public easemytrip_registration_page(WebDriver driver)
	   {
	   	this.driver=driver;
	   	PageFactory.initElements(driver, this);
	   }

}
