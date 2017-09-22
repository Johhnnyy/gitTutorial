package gitcheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {


	@Test
	public  void testMethod(){
		int a = 2;
		int b= 3;
		System.out.println("test1 result");
		System.out.println("first change");
		System.out.println(System.getProperty("build"));


	}

	@Test
	public  void testMethod2(){
		int a = 2;
		int b= 3;
		System.out.println("test1 result");
		System.out.println("first change");
		System.out.println(System.getProperty("build"));
		Assert.assertEquals(true, false);


	}

}
