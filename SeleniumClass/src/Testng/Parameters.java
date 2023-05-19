package Testng;

import org.testng.annotations.Test;

public class Parameters {
	
	@Test
	@org.testng.annotations.Parameters({"player"})
	public void cricketer(String name) {
		System.out.println("Best Allrounder in world:"+name);
	}

}
