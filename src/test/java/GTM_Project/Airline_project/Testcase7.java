package GTM_Project.Airline_project;

import org.testng.annotations.Test;

//Test for multi-city flight search
public class Testcase7 extends Launch_Quit
{

	@Test
	public void multicity_flight() throws InterruptedException
	{
		easemytrip_home_page a1=new easemytrip_home_page(driver);
		a1.sign_up();
	 	a1.customer_login();
	 	Easemytrip_login_page a2=new Easemytrip_login_page(driver);
	 	a2.email();
	 	a2.continu();
	    a2.password();
	    a2.login();
		a1.multicity();	
		a1.multicity_from_feild_1();
		a1.multicity_from_search_1();
		a1.multicity_searchiconfrom_1();
		a1.multicity_to_field_1();
		a1.multicity_to_search_1();
		a1.multicity_searchicon_to_1();
		a1.multicitydate_1();
		a1.multicity_select_date_1();
		a1.multicity_from_feild_2();
		a1.multicity_from_search_2();
		a1.multicity_searchiconfrom_2();
		a1.multicity_to_field_2();
		a1.multicity_to_search_2();
		a1.multicity_searchicon_to_2();
		a1.multicitydate_2();
		a1.multicity_select_date_2();
		a1.multicity_traveller_class();
		a1.multicity_business();
		a1.multicity_done();
		a1.multicity_search();
		
	}	
}
