package gitcheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {


	@Test
	public  void testMethod(){
		System.out.println("pass");
//		System.out.println("first change");
		System.out.println("Test Execution number:- "+System.getProperty("build"));


	}

/*	@Test
	public  void testMethod2(){

		System.out.println("fail");
//		System.out.println("first change");
//		System.out.println(System.getProperty("build"));
		Assert.assertEquals(true, false);


	}
*/
}
