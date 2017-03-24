import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

	 @Test (description="Login APP Title")
	    public void GoogleLogin() throws Exception
	    {
		 
		 WebDriver driver= null;
					
		  File chromeDriver = new File("/usr/lib/chromium-browser/chromedriver");
		    System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
		    driver = new ChromeDriver();
		
		
		    
		    driver.get("http://130.211.132.38:8181/loginapp1/");
		    String Expectedtitle = "JSP Example";
		    String Actualtitle = driver.getTitle();
		    Assert.assertEquals(Actualtitle, Expectedtitle);
		    System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		   
	    
	    }	    
	    
}
