package GTM_Project.Airline_project;

import org.testng.Assert;
import org.testng.annotations.Test;

//test login with invalid credentials and ensure proper error messages are displayed
public class Testcase3 extends Launch_Quit

{
	@Test
	public void login_fail() throws InterruptedException 
	{
			easemytrip_home_page a1=new easemytrip_home_page(driver);
		 	a1.sign_up();
		 	a1.customer_login();
		 	Easemytrip_login_page a2=new Easemytrip_login_page(driver);
		 	a2.wrong_number();
		 	a2.continu();
		 	Assert.assertTrue(a2.assertion());
		 
}
}