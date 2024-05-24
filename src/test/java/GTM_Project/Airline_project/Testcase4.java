package GTM_Project.Airline_project;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//test the search functionality for one way flight
@Listeners(Listner_class.class)
public class Testcase4 extends Launch_Quit
{

	@Test
	public void oneway_flight() throws InterruptedException
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
		Thread.sleep(10000);
	}
}
