package com.leetcode.problem189;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void testRotate1() {
		int[] act = new int[]{1,2,3,4,5,6,7};
		int[] exp = new int[]{5,6,7,1,2,3,4};
		RotateArray.rotate(act, 3);
		assertArrayEquals("Expected: " + Arrays.toString(exp) + "; Actual: " + Arrays.toString(act), exp, act);
	}
	
	@Test
	public void testRotate2() {
		int[] act = new int[]{  -1,-100,   3,  99};
		int[] exp = new int[]{   3,  99,  -1,-100};
		RotateArray.rotate(act, 2);
		assertArrayEquals("Expected: " + Arrays.toString(exp) + "; Actual: " + Arrays.toString(act), exp, act);
	}
	
	@Test
	public void testRotate3() {
		int[] act = new int[]{1,2};
		int[] exp = new int[]{1,2};
		RotateArray.rotate(act, 0);
		assertArrayEquals("Expected: " + Arrays.toString(exp) + "; Actual: " + Arrays.toString(act), exp, act);
	}
	
	@Test
	public void testRotate4() {
		int[] act = new int[]{1,2};
		int[] exp = new int[]{2,1};
		RotateArray.rotate(act, 1);
		assertArrayEquals("Expected: " + Arrays.toString(exp) + "; Actual: " + Arrays.toString(act), exp, act);
	}
}
