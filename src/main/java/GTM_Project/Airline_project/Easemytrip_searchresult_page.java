package GTM_Project.Airline_project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Easemytrip_searchresult_page 
{
	WebDriver driver;

@FindBy(id="divLogo")
 WebElement homepagebutton;

 public void homepage_button()
 {
	 homepagebutton.click();
 
 	}
 @FindBy(id="welcome-det-User")
 WebElement userbutton;

 public void welcome_user_detail()
 {
	 Actions a1=new Actions(driver);
	 a1.moveToElement(userbutton).perform();
 
 	}
 @FindBy(xpath="(//span[@class='_romnutxt'])[15]")
 WebElement logout;

 public void logut()
 {
	 logout.click();
 
 	}
 @FindBy(xpath="(//button[.='Book Now'])[1]")
 WebElement booknow;

 public void booknow()
 {
	 booknow.click();
 
 	}
 /////////////////////////////flight details///////////////
 @FindBy(xpath="(//div[@class='d-up'])[1]")
 WebElement flightdetails;

 public void flight_details()
 {
	 flightdetails.click();
 
 	}
 @FindBy(id="Flinfo")
 WebElement flightinfo;

 public boolean flight_information()
 {
	 boolean ansr=flightinfo.isDisplayed();
 	return ansr;
 
 	}
 @FindBy(xpath="(//li[@class='ng-scope'])[1]")
 WebElement faredetails;

 public boolean fare_details()
 {
	 boolean ansr=faredetails.isDisplayed();
 	return ansr;
 
 	}
 @FindBy(xpath="(//li[@class='ng-scope'])[2]")
 WebElement baggageinfo;

 public boolean baggage_information()
 {
	 boolean ansr=baggageinfo.isDisplayed();
 	return ansr;
 
 	}
 @FindBy(xpath="(//li[@class='ng-scope'])[3]")
 WebElement cancellationrules;

 public boolean cancellation_rules()
 {
	 boolean ansr=cancellationrules.isDisplayed();
 	return ansr;
 
 	}
 
 ////////////////////////////////////////////////
    @FindBy(id="txtEmailId")
    WebElement email_field;

    public void email()
    {
    	email_field.sendKeys("ishanathasni08@gmail.com");
    
    	}
    @FindBy(xpath="(//span[@class='checkmark-radio'])[4]")
    WebElement radiobutton;
    public void no_insure_radiobutton()
    {
   	boolean a= radiobutton.isSelected();
   	if(a==false)
   	{
   		radiobutton.click();
   	}
    }
    
    @FindBy(id="spnVerifyEmail")
    WebElement continue_booking;

    public void continue_booking()
    {
    	continue_booking.click();
    
    	}
/////////////////////adult////////////////////////    
    @FindBy(id="titleAdult0")
    WebElement title;

    public void title_dropdown()
    {
    	Select s1=new Select(title);
    	s1.selectByVisibleText("Mrs.");

    	}
    
    @FindBy(id="txtFNAdult0")
    WebElement firstname;

    public void first_name()
    {
    	firstname.sendKeys("ishana fathima");
    
    	}
    @FindBy(id="txtLNAdult0")
    WebElement lastname;

    public void last_name()
    {
    	lastname.sendKeys("km");
    
    	}
//////////    
    
    @FindBy(id="titleAdult1")
    WebElement title2;

    public void title_dropdown2()
    {
    	Select s1=new Select(title2);
    	s1.selectByVisibleText("MS");

    	}
    @FindBy(id="txtFNAdult1")
    WebElement firstname2;

    public void first_name2()
    {
    	firstname2.sendKeys("zahisha");
    
    	}
    @FindBy(id="txtLNAdult1")
    WebElement lastname2;

    public void last_name2()
    {
    	lastname2.sendKeys("Mariyam");
    
    	}
/////////    
    
    @FindBy(id="titleAdult2")
    WebElement title3;

    public void title_dropdown3()
    {
    	Select s1=new Select(title3);
    	s1.selectByVisibleText("MR");

    	}
    @FindBy(id="txtFNAdult2")
    WebElement firstname3;

    public void first_name3()
    {
    	firstname3.sendKeys("Ayaz");
    
    	}
    @FindBy(id="txtLNAdult2")
    WebElement lastname3;

    public void last_name3()
    {
    	lastname3.sendKeys("MH");
    
    	}
//////////   
    @FindBy(id="txtCPhone")
    WebElement mobnmbr;

    public void mobile_number()
    {
    	mobnmbr.sendKeys("6362378221");
    
    	}
    
    @FindBy(xpath="(//span[@id='spnTransaction'])[1]")
    WebElement continue_booking2;
    public void continue_booking2()
    {
    	continue_booking2.click();
    
    	}
    @FindBy(xpath="//a[.='Let Me Choose Myself']")
    WebElement letmechoosmyself;

    public void let_me_choosemyself()
    {
    	letmechoosmyself.click();
    
    	}
    
    @FindBy(id="skipPop")
    WebElement skip;

    public void skipto_payment()
    {
    	skip.click();
    
    	}	
    @FindBy(xpath="(//li[@class='seat viewdtls ng-scope'])[13]")
    WebElement selectseat;

    public void select_seat()
    {
    	selectseat.click();
    
    	}
    @FindBy(id="BLR_AYJ8E")
    WebElement selectseat2;

    public void select_seat2()
    {
    	selectseat2.click();
    
    	}
    @FindBy(id="BLR_AYJ8D")
    WebElement selectseat3;

    public void select_seat3()
    {
    	selectseat3.click();
    
    	}
/////////////////
    @FindBy(id="add3")
    WebElement meal;

    public void add_meal()
    {
    	meal.click();
    
    	}
//////////////////////  
    @FindBy(id="add31")
    WebElement baggage;

    public void add_baggage()
    {
    	baggage.click();
    
    	}
///////////////////////    
    @FindBy(xpath="//div[@id='divContinueTransactionSCD']")
    WebElement continue_booking3;

    public void continue_booking3()
    {
    	continue_booking3.click();
    
    	}
    
    @FindBy(id="spnRdoBOOKNOW")
    WebElement coupon;

    public  void coupen()
    {
    	boolean ansr=coupon.isSelected();
    	if(ansr==false)
    	{
    	coupon.click();
    	}
    	}
 public Easemytrip_searchresult_page(WebDriver driver)
 {
 	this.driver=driver;
 	PageFactory.initElements(driver, this);
 }

}


