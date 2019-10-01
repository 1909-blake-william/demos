package com.revature.d;

public class TemperatureCalculator {
	public static void main(String[] args) {
		double initial = 78;
		double converted = convertToCelcius(initial);
		System.out.println("inital value in F is: " + initial);
		System.out.println("new value in celcius is: " + converted);
	}
	
	public static double convertToCelcius(double fahrenheit) {
		double result = (fahrenheit-32)*5/9;
		return result;
	}
	
	
	
}
