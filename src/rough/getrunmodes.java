package rough;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class getrunmodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(System.getProperty("user.dir"));
		Xls_Reader xls= new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\Test Cases.xlsx");
		for(int rnum=2;rnum<=xls.getRowCount("Test Cases");rnum++){
			if(xls.getCellData("Test Cases", "Runmode", rnum).equalsIgnoreCase("Y"))
			System.out.println(xls.getCellData("Test Cases", "TCID", rnum)+"   "+xls.getCellData("Test Cases", "Runmode", rnum));
		}

	
System.out.println(TestUtil.isexecutable("Test2", xls));
	}


	
	
}
