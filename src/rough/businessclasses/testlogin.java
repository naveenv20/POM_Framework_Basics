package rough.businessclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;











import com.qtpselenium.carwale.pages.landingpage;
import com.qtpselenium.carwale.pages.loginpage;
import com.qtpselenium.carwale.pages.personalprofile;

public class testlogin {

	public static void main(String[] args) throws IOException {
	
		//intital logs
		//intital properties file 
		
		Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("Starting test");
		Properties prop= new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\Config.properties");
		prop.load(fs);
		
		//intial browser
		WebDriver d1=null;
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
		d1= new FirefoxDriver();
		}
		
		//page factory style begins here
		d1.get("http://www.carwale.com/");
		d1.findElement(By.xpath("//div[@class='city-content-close']")).click();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage lp=PageFactory.initElements(d1, loginpage.class);
		landingpage Lanpage=lp.dologin("naveen_v201985@rediffmail.com", "greffendor");
		personalprofile perprofi=Lanpage.gotoprofile();
		perprofi.updateprofile();
	}

}
