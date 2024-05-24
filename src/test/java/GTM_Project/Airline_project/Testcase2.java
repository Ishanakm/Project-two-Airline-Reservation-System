package GTM_Project.Airline_project;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//validate the login functionality with valid credentials
@Listeners(Listner_class.class)
public class Testcase2 extends   Launch_Quit
{
	@Test(retryAnalyzer=GTM_Project.Airline_project.Retry_class.class)
	
	public void login() throws InterruptedException, IOException 
	{
			easemytrip_home_page a1=new easemytrip_home_page(driver);
		 	a1.sign_up();
		 	a1.customer_login();
		 	Easemytrip_login_page a2=new Easemytrip_login_page(driver);
		 	a2.email();
		 	a2.continu();
		 	a2.password();
		 	a2.login();
	Assert.assertTrue(true);
		 	
	
}
}