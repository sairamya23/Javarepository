import com.cts.selenium.SuperBaseClass;

public class Scrollaction extends SuperBaseClass {

	public static void main(String[] args) throws Exception {
		browserLaunch("chrome","http://automationpractice.com/index.php");
		Thread.sleep(5000);
		pagescrollvertical("down", 300);
	pagescrollvertical("up",-100);
	
	Thread.sleep(4000);
	pagescrollvertical("bottom");
	Thread.sleep(2000);
	pagescrollvertical("top");

	}

}
 