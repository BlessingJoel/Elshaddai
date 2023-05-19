package Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipMethod {

	@Test(enabled = false)
	public void firstcase() {
		System.out.println("Pass");
	}
	@Test
	public void secondcase() {
		System.out.println("Fail");
		throw new SkipException(null);
	}
	@Test(enabled = false)
	public void thirdcase() {
		System.out.println("Error");
	}
}
