package com.revature.r.mathapp;

public class MathApplication {

	private Calculator calc = new Calculator();

	public double solve(double x) {
		double inner = calc.divide(calc.subtract(calc.multiply(5,x),2), 4);

		return calc.multiply(inner, inner);
	}
}
