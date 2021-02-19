package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Calculation;

public class TestLogic {

	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int[] { 1, 4, 3, 2 }));
		assertEquals(-1,Calculation.findMax(new int[] { -12, -1 - 3, -4, -2 }));
	}
}
