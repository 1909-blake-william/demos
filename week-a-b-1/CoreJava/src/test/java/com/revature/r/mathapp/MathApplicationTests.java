package com.revature.r.mathapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTests {

	@Mock
	private Calculator someCalc;

	@InjectMocks
	private final MathApplication someMathApplication = new MathApplication();

	@Test
	public void testPositiveValues() {
		Mockito.when(someCalc.subtract(25,2)).thenReturn(23d);
		Mockito.when(someCalc.multiply(5,5)).thenReturn(25d);
		Mockito.when(someCalc.divide(23,4)).thenReturn(5.75);
		Mockito.when(someCalc.multiply(5.75, 5.75)).thenReturn(33.0625);
		double result = someMathApplication.solve(5);
		assertEquals(33.0625, result, 0.001);
		Mockito.verify(someCalc, Mockito.times(1)).subtract(25, 2);
		Mockito.verify(someCalc, Mockito.times(1)).multiply(5, 5);
		Mockito.verify(someCalc, Mockito.times(1)).divide(23, 4);
		Mockito.verify(someCalc, Mockito.times(1)).multiply(5.75, 5.75);

		
		Mockito.when(someCalc.subtract(30,2)).thenReturn(28d);
		Mockito.when(someCalc.multiply(5,6)).thenReturn(30d);
		Mockito.when(someCalc.divide(28,4)).thenReturn(7d);
		Mockito.when(someCalc.multiply(7,7)).thenReturn(49d);
		result = someMathApplication.solve(6);
		assertEquals(49, result, 0.001);

		Mockito.when(someCalc.subtract(1000,2)).thenReturn(998d);
		Mockito.when(someCalc.multiply(5,200)).thenReturn(1000d);
		Mockito.when(someCalc.divide(998,4)).thenReturn(249.5d);
		Mockito.when(someCalc.multiply(249.5, 249.5)).thenReturn(62250.25);
		result = someMathApplication.solve(200);
		assertEquals(62250.25, result, 0.001);
	}

	@Test
	public void testZero() {
		Mockito.when(someCalc.subtract(0,2)).thenReturn(-2d);
		Mockito.when(someCalc.multiply(5,0)).thenReturn(0d);
		Mockito.when(someCalc.divide(-2,4)).thenReturn(-0.5d);
		Mockito.when(someCalc.multiply(-0.5,-0.5)).thenReturn(0.25);
		double result = someMathApplication.solve(0);
		assertEquals(0.25, result, 0.001);
	}

	@Test
	public void testNegativeValues() {
		Mockito.when(someCalc.subtract(-25,2)).thenReturn(-27d);
		Mockito.when(someCalc.multiply(5,-5)).thenReturn(-25d);
		Mockito.when(someCalc.divide(-27,4)).thenReturn(-6.75);
		Mockito.when(someCalc.multiply(-6.75,-6.75)).thenReturn(45.562);
		double result = someMathApplication.solve(-5);
		assertEquals(45.5625, result, 0.001);

		Mockito.when(someCalc.subtract(-30,2)).thenReturn(-32d);
		Mockito.when(someCalc.multiply(5,-6)).thenReturn(-30d);
		Mockito.when(someCalc.divide(-32,4)).thenReturn(-8d);
		Mockito.when(someCalc.multiply(-8,-8)).thenReturn(64d);
		result = someMathApplication.solve(-6);
		assertEquals(64, result, 0.001);

		
		Mockito.when(someCalc.subtract(-1000.05,2)).thenReturn(-1002.05d);
		Mockito.when(someCalc.multiply(5,-200.01)).thenReturn(-1000.05d);
		Mockito.when(someCalc.divide(-1002.05,4)).thenReturn(-250.5125d);
		Mockito.when(someCalc.multiply(-250.5125,-250.5125)).thenReturn(62756.5126562);
		result = someMathApplication.solve(-200.01);
		assertEquals(62756.5126562, result, 0.001);
	}

}
