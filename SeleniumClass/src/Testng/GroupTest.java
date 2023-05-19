package Testng;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = {"ninja"})
	public void ninja() {
		System.out.println("Prefect");
	}
	@Test(groups = {"jaguar"})
	public void ninja1() {
		System.out.println("Loyal");
	}
	@Test(groups = {"ninja"})
    public void jaguar() {
    	System.out.println("Alway");
    }
	@Test(groups = {"jaguar"})
    public void jaguar1() {
    	System.out.println("Loco Pilot");
    }
}
