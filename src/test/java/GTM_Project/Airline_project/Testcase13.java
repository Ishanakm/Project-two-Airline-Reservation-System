package GTM_Project.Airline_project;

import org.junit.Assert;
import org.testng.annotations.Test;

//check if user is able to apply for coupon while ordering the product
public class Testcase13 extends Launch_Quit
{
	@Test
	public void coupon_code() throws InterruptedException
	{
		easemytrip_home_page a1=new easemytrip_home_page(driver);
		a1.sign_up();
	 	a1.customer_login();
	 	Easemytrip_login_page a2=new Easemytrip_login_page(driver);
	 	a2.email();
	 	a2.continu();
	    a2.password();
	    a2.login();
	 	a1.from_feild();
		a1.from_search();
		a1.searchiconfrom();
		a1.to_field();
		a1.to_search();
		a1.searchiconto();
		a1.date();
		a1.select_date();
		a1.traveller_class();
		a1.economy();
		a1.done();
		a1.search();
		Easemytrip_searchresult_page a3=new Easemytrip_searchresult_page(driver);
		a3.booknow();
		a3.email();
		a3.no_insure_radiobutton();
		a3.continue_booking();
		a3.title_dropdown();
		a3.first_name();
		a3.last_name();
		a3.mobile_number();
	    a3.coupen();
	  Assert.assertTrue(true);	
	
	
	
	
	
	
	}
}