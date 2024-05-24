package GTM_Project.Airline_project;

import org.testng.annotations.Test;

//check if user is able to search domestic round trip flight
public class Testcase14 extends Launch_Quit
{

	@Test
	public void domestic_roundtrip_flight() throws InterruptedException
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
		Thread.sleep(3000);
	    a1.traveller_class();
		a1.done();
		a1.roundtrip();	
		a1.returndate();
		a1.select_return_date();
		a1.search();
		
	}	
}
