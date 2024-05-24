package GTM_Project.Airline_project;

import org.testng.Assert;
import org.testng.annotations.Test;

//validate the systems ability to handle multiple passengers in a single booking
public class Testcase9 extends Launch_Quit
{
@Test
public void multiple_passengers() throws InterruptedException
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
	a1.add_adults();
	a1.add_adults();
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
	a3.title_dropdown2();
	a3.first_name2();
	a3.last_name2();
	a3.title_dropdown3();
	a3.first_name3();
	a3.last_name3();
	a3.mobile_number();
	a3.continue_booking2();
	/*Easemytrip_payment_page a4=new Easemytrip_payment_page(driver);
	Thread.sleep(2000);
	a4.net_banking();
	a4.state_bank();
	a4.make_payment();
	Thread.sleep(4000);
	Assert.assertEquals(driver.getTitle(), "STATE BANK OF INDIA"); */
}
}
