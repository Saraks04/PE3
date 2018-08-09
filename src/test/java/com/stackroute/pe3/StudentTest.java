package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
	
	private static StudentMarks s;
	@BeforeClass
	public void setUp() 
	{
		s=new StudentMarks();
	}

	@After
	public void tearDown() 
	{
		s=null;
	}

	@Test
	public void test1()
	{
		int a[]= {20,77,102,34,57};
		String r=s.checkgrade(a);
		assertEquals("Error",r);
	}
	@Test
	public void test2()
	{
		int a[]= {27,73,66,38,52};
		String r=s.checkgrade(a);
		assertEquals("Passed",r);
	}
	@Test
	public void test3()
	{
		int a[]= {80,120,102,74,67};
		String r=s.checkgrade(a);
		assertEquals("Error",r);
	}

}
