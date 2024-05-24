package GTM_Project.Airline_project;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//verify that user can successfully register for a new account
//@Listeners(Listner_class.class)
public class Testcase1 extends Launch_Quit
{

	 	
	@Test
public void registration() throws InterruptedException
{
		easemytrip_home_page a1=new easemytrip_home_page(driver);
	 	a1.sign_up();
	 	a1.customer_login();
	 	easemytrip_registration_page a2=new easemytrip_registration_page(driver);
	 	a2.mobile_number();
	 	a2.continu();
	 	Thread.sleep(5000);
	 	a2.createaccount();
	 	Assert.assertTrue(true);
}
}	
	
	
	
	
	
	
















/*a1.first_name();
a1.last_name();
a1.Email();
a1.password();
a1.confirm_Password();
a1.signup();*/ 
