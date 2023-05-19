package Testng;

import org.testng.annotations.Test;

public class DependenciesMethod {
  
	@Test
	public void firstcase() {
		System.out.println("Pass");
	}
	@Test
	public void secondcase() {
//		int []arr= {1,2,3};
//		System.out.println(arr[5]);
		System.out.println("Fail");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "secondcase")
	public void thirdcase() {
		System.out.println("Error");
	}
}
