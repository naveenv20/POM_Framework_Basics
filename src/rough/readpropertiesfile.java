package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readpropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop= new Properties();
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\OR.properties");
		prop.load(fs);
		
		System.out.println(prop.getProperty("name"));
	}

}
