package GTM_Project.Airline_project;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class easemytrip_home_page 
{
WebDriver driver;

@FindBy(id="divSignInPnl")
WebElement sign_up;

public void sign_up ()
{
	sign_up.click();
	}

   @FindBy(id="shwlogn")
   WebElement customer_login;

public void customer_login ()
{
	customer_login.click();
	}

 //////////////////////////////////////one way//////////////////////////////
     @FindBy(xpath="(//input[@id='FromSector_show'])[1]")
     WebElement from;
     public void from_feild ()
     {
    	 from.click();
     }
     
     @FindBy(id="a_FromSector_show")
     WebElement search_bar;
     public void from_search()
     {
     search_bar.sendKeys("del");
       }
     @FindBy(className="searcIcn")
     WebElement seacrh;
     public void searchiconfrom()
     {
    	 seacrh.click();
     }
     @FindBy(xpath="(//input[@id='Editbox13_show'])[1]")
     WebElement to;
     public void to_field()
     {
    	 to.click();
       }
     @FindBy(id="a_Editbox13_show")
     WebElement tosearchbar;
     public void to_search()
     {
    	 tosearchbar.sendKeys("bom");
     }
     @FindBy(xpath="(//i[@class='searcIcn'])[2]")
     WebElement seacrhto;
     public void searchiconto()
     {
    	 seacrhto.click();
     }
//////////////////////////////////////////////////////date////////////////////////
     @FindBy(id="ddate")
     WebElement date;
     public void date()
     {
    	 date.click();
     }
     @FindBy(id="frth_4_20/06/2024")
     WebElement selectdate;
     public void select_date()
     {
    	 selectdate.click();
     }
     
  
     @FindBy(className="srchBtnSe")
     WebElement search_button;
     public void search()
     {
    	 search_button.click();
     }
//////////////////////round trip///////////////////////////////////////
     @FindBy(id="rtrip")
     WebElement roundtrip;
     public void roundtrip()
     {
    	 roundtrip.click();
     }
     
     @FindBy(id="rdatelbl")
     WebElement returndate;
     public void returndate()
     {
    	 returndate.click();
     }
     @FindBy(xpath="//li[@class='active-date']")
     WebElement selectreturndate;
     public void select_return_date()
     {
    	 selectreturndate.click(); 
     }
///////////////////////  classes/////////////////////////////////////////  
     @FindBy(id="spnTraveller")
     WebElement travellerandclass;
     public void traveller_class()
     {
    	 travellerandclass.click();
     }
     @FindBy(id="spanEconomy")
     WebElement economy;
     public void economy()
     {
    	boolean a= economy.isSelected();
    	if(a==false)
    	{
    		economy.click();
    	}
     }
     
      @FindBy(id="traveLer")
     WebElement done_button;
     public void done()
     {
    	 done_button.click();
     }
     
    
     @FindBy(id="lbpEconomy")
     WebElement premiumeconomy;
     public void premiumeconomy()
     {
    	boolean a= premiumeconomy.isSelected();
    	if(a==false)
    	{
    		premiumeconomy.click();
    	}
     }
     @FindBy(id="spanBusiness")
     WebElement business;
     public void business()
     {
    	boolean a= business.isSelected();
    	if(a==false)
    	{
    		business.click();
    	}
     }
     @FindBy(id="spanFirst")
     WebElement first;
     public void first()
     {
    	boolean a= first.isSelected();
    	if(a==false)
    	{
    		first.click();
    	}
     }
     
     @FindBy(id="add")
     WebElement add;
     public void add_adults()
     {
    	 add.click();
    	 }
//////////////////////////////////multicity///////////////////////////////
     @FindBy(id="mcity")
     WebElement multicity;
     public void multicity()
     {
    	 multicity.click();
     }
     
     @FindBy(id="FromSector-mul1_show")
     WebElement frommul_1;
     public void multicity_from_feild_1 ()
     {
    	 frommul_1.click();
     }
     
     @FindBy(id="a_FromSector-mul1_show")
     WebElement mul_search_bar;
     public void multicity_from_search_1()
     {
    	 mul_search_bar.sendKeys("blr");
       }
     @FindBy(xpath="(//i[@class='searcIcn'])[4]")
     WebElement mul_seacrh;
     public void multicity_searchiconfrom_1()
     {
    	 mul_seacrh.click();
     }
     @FindBy(id="ToSector-mul1_show")
     WebElement tomul_1;
     public void multicity_to_field_1()
     {
    	 tomul_1.click();
       }
     @FindBy(id="a_ToSector-mul1_show")
     WebElement mul_tosearchbar1;
     public void multicity_to_search_1()
     {
    	 mul_tosearchbar1.sendKeys("del");
     }
     @FindBy(xpath="(//i[@class='searcIcn'])[5]")
     WebElement mulseacrhto_1;
     public void multicity_searchicon_to_1()
     {
    	 mulseacrhto_1.click();
     }
    /// 
     @FindBy(id="FromSector-mul2_show")
     WebElement frommul_2;
     public void multicity_from_feild_2 ()
     {
    	 frommul_2.click();
     }
     
     @FindBy(id="a_FromSector-mul2_show")
     WebElement mul_search_bar2;
     public void multicity_from_search_2()
     {
    	 mul_search_bar2.sendKeys("del");
       }
     @FindBy(xpath="(//i[@class='searcIcn'])[6]")
     WebElement mul_seacrh2;
     public void multicity_searchiconfrom_2()
     {
    	 mul_seacrh2.click();
     }
     @FindBy(id="ToSector-mul2_show")
     WebElement tomul_2;
     public void multicity_to_field_2()
     {
    	 tomul_2.click();
       }
     @FindBy(id="a_ToSector-mul2_show")
     WebElement mul_tosearchbar2;
     public void multicity_to_search_2()
     {
    	 mul_tosearchbar2.sendKeys("kcz");
     }
     @FindBy(xpath="(//i[@class='searcIcn'])[7]")
     WebElement mulseacrhto_2;
     public void multicity_searchicon_to_2()
     {
    	 mulseacrhto_2.click();
     }
     
/////
     @FindBy(id="ddateMul1")
     WebElement datemul1;
     public void multicitydate_1()
     {
    	 datemul1.click();
     }
     @FindBy(id="fiv_3_29/05/2024")
     WebElement mulselectdate1;
     public void multicity_select_date_1()
     {
    	 mulselectdate1.click();
     }
     
     @FindBy(id="ddateMul2")
     WebElement datemul2;
     public void multicitydate_2()
     {
    	 datemul2.click();
     }
     @FindBy(id="fiv_4_30/05/2024")
     WebElement mulselectdate2;
     public void multicity_select_date_2()
     {
    	 mulselectdate2.click();
     }
////////
     @FindBy(id="snMulTravel")
     WebElement multicitytravellerandclass;
     public void multicity_traveller_class()
     {
    	 multicitytravellerandclass.click();
     }
     @FindBy(id="spnmBusiness")
     WebElement mulbusiness;
     public void multicity_business()
     {
    	boolean a= mulbusiness.isSelected();
    	if(a==false)
    	{
    		mulbusiness.click();
    	}
     }
     
     @FindBy(xpath="(//a[@class='dn_btn'])[2]")
    WebElement muldone_button;
    public void multicity_done()
    {
    	muldone_button.click();
    }
    @FindBy(className="srchBtnmultcty")
    WebElement mulsearch_button;
    public void multicity_search()
    {
    	mulsearch_button.click();
    }
//////////////////////////////////////
     
     
     
public easemytrip_home_page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}







}
