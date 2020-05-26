package hooks;

import com.adactln.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class UsingHooks extends BaseClass{
	
	@Before
	public void beforecase() {
System.out.println("Test Case No");
	}
	@After
	public void aftercase()
	{
		driver.quit();
	}
	

}
