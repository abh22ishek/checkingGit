 package com.pkg.Game;

import static org.junit.Assert.*;

import org.junit.Test;

public class CricketTest {

	@Test
	public void testSort_input() {
		//fail("Not yet implemented");
		
		
		
		Cricket cricket=new Cricket();
		int arr[]=new int[]{50,39,40,20,10,80};
		int result[]=new int[]{80,50,40,39,20,10};
		
		
		int res[]=cricket.sort_input(arr);
		assertEquals(res,arr);
		assertTrue(result.length==arr.length);
	}

}
