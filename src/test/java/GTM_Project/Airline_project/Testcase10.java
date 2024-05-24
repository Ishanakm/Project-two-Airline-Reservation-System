package GTM_Project.Airline_project;

import org.junit.Assert;
import org.testng.annotations.Test;

/*validate the flight information , fare details, baggage rules and cancellation rules link has the 
details in the search result page*/

public class Testcase10 extends Launch_Quit
{
@Test
public void search_result_details()
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
	a3.flight_details();
	boolean flight_info=a3.flight_information();
	Assert.assertTrue(flight_info);
	boolean fare_detail=a3.fare_details();
    Assert.assertTrue(fare_detail);
    boolean bag_info=	a3.baggage_information();
     Assert.assertTrue(bag_info);
     boolean cancel_rules=	a3.cancellation_rules();
    Assert.assertTrue(cancel_rules);
	
	
	
	
	
	
	
	
	
}
}
