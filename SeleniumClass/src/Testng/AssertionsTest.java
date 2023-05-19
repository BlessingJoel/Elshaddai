package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
	
	String name="Hardik";
	 boolean pandya=false;
	  boolean Hardik=true;
	
	@Test
	public void Assertequal() {
		Assert.assertEquals(name,"Hardik");
//		Assert.assertEquals(name,"hardik");
		}
	@Test
	public void Assernotequal() {
		Assert.assertNotEquals(name,"hardik");
//		Assert.assertNotEquals(name,"Hardik");
	}
	@Test
	public void Asserttrue() {
		Assert.assertTrue(Hardik, "Hardik is a cricketer");
//		Assert.assertTrue(pandya, "Pandya is a pilot");
	}
	@Test
	public void Assertfalse() {
		Assert.assertFalse(pandya, "Pandya is a pilot");
//		Assert.assertFalse(Hardik, "Hardik is a cricketer");
		
	}
	

}
