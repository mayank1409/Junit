package com.javateacher.junit5;

public class MathUtils {
	
	public static double divide(double numerator, double denominator) {
		
		if (denominator == 0) {
			throw new IllegalArgumentException("can't divide by zero");
		}
		
		return numerator / denominator;
	}
	
}
