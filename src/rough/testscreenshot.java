package rough;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver d1= new FirefoxDriver();
		d1.get("http://gmail.com");
		
		//String scrsht_filename=tcid+"_"+keyword+"_"+rNum+".jpg";
		File scrFile = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//gmail.jpg"));

		
	}

}
