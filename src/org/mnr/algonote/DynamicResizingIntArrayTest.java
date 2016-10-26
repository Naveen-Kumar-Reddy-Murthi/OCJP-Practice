package org.mnr.algonote;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DynamicResizingIntArrayTest {
	
	DynamicResizingIntArray array;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("after class");
	}
	
	@Before
	public void before(){
		System.out.println("before");
	  array= new DynamicResizingIntArray();
	}
	
	@After
	public void after(){
		System.out.println("after");
		array=null;
	}

	@Test(timeout=100)
	public void testAdd() {
		
		array.add(1, 10);
		array.add(7, 7);
		int[] exptected = array.toArray();
		int[] actual	= new int[]{0,10,0,0,0,0,0,7};
		assertArrayEquals(exptected, actual);
	}

	@Test
	public void testInsert() {
		array.insert(8, 8);
		
		int[] exptected = array.toArray();
		int[] actual	= new int[]{0,0,0,0,0,0,0,0,8};
		assertArrayEquals(exptected, actual);
	}

}
