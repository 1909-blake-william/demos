package com.revature.p.code.challenge;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayProductChallengeTests {

	@BeforeClass
	public static void beforeAnySetup() {
		System.out.println("Before class runs before any test has run and is used to do setup");
	}

	@Before
	public void beforeEachSetup() {
		System.out.println("Before runs before each and every test");
	}

	@After
	public void afterEachSetup() {
		System.out.println("After runs after each and every test");
	}

	@AfterClass
	public static void afterAnySetup() {
		System.out.println("After class runs after all test have run and is used to do clean up");
	}

	@Test
	public void testOne() {
		int[] result = ArrayProductChallenge.solution(new int[] { 1, 2, 3, 4 });
		assertArrayEquals(new int[] { 24, 12, 8, 6 }, result);
	}

	@Test
	public void testTwo() {
		int[] result = ArrayProductChallenge.solution(new int[] { 7, 1, 1, 1 });
		assertArrayEquals(new int[] { 1, 7, 7, 7 }, result);
	}

	@Test
	public void testEmptyArray() {
		int[] result = ArrayProductChallenge.solution(new int[] {});
		assertNull(result);
	}

	@Test
	public void testNullInput() {
		int[] result = ArrayProductChallenge.solution(null);
		assertNull(result);
	}

	@Test
	public void testSingleElement() {
		int[] result = ArrayProductChallenge.solution(new int[] { 7 });
		assertNull(result);
	}

}
