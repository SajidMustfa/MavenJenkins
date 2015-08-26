package com.companyname.automobile;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.companyname.automobile.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void Test(){

	System.out.println("hi");
	} 

	@Test
	public void TestUtil(){
	
	Util obj=new Util();
	int expected=5;
	int actual=obj.getName();
	Assert.assertEquals(expected,actual);
	}

}
