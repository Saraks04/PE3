package com.stackroute.pe3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VowelTest {

	private static WordVowel v;
	@BeforeClass
	public void setUp() 
	{
		v=new WordVowel();
	}

	@AfterClass
	public void tearDown() 
	{
		v=null;
	}

	@Test
	public void test1() 
	{
		String[] str= {"India","United states","Germany","Egypt","czechoslovakia"};
		String[] str1= {"0 Ind","1 Untd stts","2 Grmny","3 Egypt","czchslvk1"};
		String[] word=v.calvowel(str1);
		
		assertEquals(str1,word);
	}

}
