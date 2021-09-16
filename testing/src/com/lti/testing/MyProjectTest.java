package com.lti.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Set;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyProjectTest {

	@Test
	void makeUpperTest1() {
		MyProject mp=new MyProject();
		String res=mp.makeUpper("stars");
		assertEquals("STARS",res);
	}
	@Test
	void makeUpperTest2() {
		MyProject mp=new MyProject();
		String res=mp.makeUpper("ant");
		assertEquals("ANT",res);
	}
	@Test
	void makeUpperTest3() {
		MyProject mp=new MyProject();
		String res=mp.makeUpper("NEEL");
		assertEquals("NEEL",res);
	}
	/*
	@Test
	void DivideTest1() {
		Divide mp=new Divide();
		int res=0;
		try{
			res=mp.divide(10, 0);
		}
		catch(Exception e)
		{
			fail("Exception Occured");
		}
	}*/
	@Test
	void RemDupsTest1() throws Exception {
		RemoveDups mp=new RemoveDups();
		int[] arr = new int[]{10,20,20,30,30}; 
		int[] arr2 = new int[]{30,20,10};
		int[] res=mp.remDeps(arr);
		assertArrayEquals(arr2,res);
	}
	@Test
	void RemDupsTest2() throws Exception {
		RemoveDups mp=new RemoveDups();
		int[] arr = new int[]{9,9,1,2,3}; 
		int[] arr2 = new int[]{9,3,2,-1};
		int[] res=mp.remDeps(arr);
		Arrays.equals(arr2,res);
	}
	@Test
	void RemDupsTest3() throws Exception {
		RemoveDups mp=new RemoveDups();
		int[] arr = new int[]{1,4,4,3}; 
		int[] arr2 = new int[]{4,3,1};
		int[] res=mp.remDeps(arr);
		Arrays.equals(arr2,res);
	}
	

}
