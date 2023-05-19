package Testng;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void firstcase() {
		System.out.println("Pass");
	}
	@Test(priority = 2)
	public void secondcase() {
		System.out.println("fail");
	}
	@Test(priority = 3)
	public void thridcase() {
		System.out.println("Error");
	}

}
