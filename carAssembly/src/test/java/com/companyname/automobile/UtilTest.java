package com.companyname.automobile;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.companyname.automobile.*;
/**
 * Unit test for simple App.
 */
public class UtilTest
{
	@Test
	public void Test(){

	System.out.println("World");
	} 

	@Test
	public void TestUtil(){
	
	Util obj=new Util();
	int expected=5;
	int actual=obj.getName();
	Assert.assertEquals(expected,actual);
	}
@Test
	public void Test2(){

	System.out.println("World2");
	} 

@Test
	public void Test3(){

	System.out.println("World3");
	} 

@Test
	public void Test4(){

	System.out.println("World4");
	} 

}