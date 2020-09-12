package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider {
	
	@DataProvider(name = "TestData")
	public Object[][] testData() {
		Object[][] data = new Object[2][2];
		//String Data
		data[0][0] = "Test1"; //s1
		data[0][1] = "Test2"; //s2
		
		data[1][0] = "Test3"; //s1
		data[1][1] = "Test4"; //s2
		
		return data;
		
	}
	
	@DataProvider(name = "TestData1")
	public Object[][] testData1() {
		Object[][] data = new Object[3][3];
		//Int Data
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
		
		
		return data;
		
	}


	@Test(dataProvider="TestData")
	public void test(String s1, String s2) {
		System.out.println("s1"+" "+s1+" s2"+" "+s2);
	}
	
	
	@Test(dataProvider="TestData1")
	public void test1(int i1, int i2, int i3) {
		System.out.println("i1"+" "+i1+" i2"+" "+i2+" i3"+" "+i3);
	}
	
	
}
