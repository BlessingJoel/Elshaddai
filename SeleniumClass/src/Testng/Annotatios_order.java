package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotatios_order {
  @Test
  public void test() {
	  System.out.println("im test");
  }
//  @Test
//  public void test1() {
//	  System.out.println("im second test");
//  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im aftersuite");
  }

}
