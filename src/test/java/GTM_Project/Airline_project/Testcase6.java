package GTM_Project.Airline_project;

import org.testng.annotations.Test;

//validate search result for different classes(economy,buisiness,first class)
public class Testcase6 extends Launch_Quit
{
	@Test
	public void flight_classes() throws InterruptedException
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
	a3.homepage_button();
	a1.traveller_class();
	a1.premiumeconomy();
	a1.done();
	a1.search();
	Thread.sleep(2000);
	a3.homepage_button();
	a1.traveller_class();
	a1.business();
	a1.done();
	a1.search();
	Thread.sleep(2000);
	a3.homepage_button();
	a1.traveller_class();
	a1.first();
	a1.done();
	a1.search();
}
}