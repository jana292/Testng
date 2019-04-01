package edu.Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgMethodsDemo  {
	
	/*@Test(invocationCount=5000)
	public void b()
	{
		System.out.println("2nd test");
	}
	
	@Test(invocationCount=2)
	public void z()
	{
		System.out.println("1st test");
	}
	*/
	
	
	
	
	@BeforeSuite
	public void a() {
		System.out.println("Before Suite Ro2 JEnkins");
	}
	
	@BeforeTest
	public void b()
	{
		System.out.println("Before Test Ro2");
	}
	
	@Test(enabled=true)
	public void a2()
	{
		System.out.println("2nd test");
	}
	
	@Test()
	public void a1()
	{
		System.out.println("1st test");
	}
	
	@BeforeClass
	public void c()
	{
		System.out.println(" Before class Ro2");
	}
	
	@BeforeMethod
	public void d()
	{
		System.out.println("Before Method Ro2");
	}
	
	@AfterMethod
	public void e()
	{
		System.out.println("After the method Ro2");
	}
	
	@AfterMethod
	public void f()
	{
		System.out.println("After Method Ro2");
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("After Class Ro2");
	}
	
	@AfterTest
	public void h()
	{
		System.out.println("After the Test Ro2");
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("After the Suite Ro2");
	}

}
