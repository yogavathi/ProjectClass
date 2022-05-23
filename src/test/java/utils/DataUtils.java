package utils;

import org.testng.annotations.DataProvider;

public class DataUtils {
@DataProvider
private String[][] getData() {
	String[][]data = new String[2][2];
	data[0][0]="koushik350@gmail.com";
	data[0][1]="Pass123$";
	
	data[1][0]="vallideva86";
	data[1][1]="data123$";
	return data;
			

}
}
