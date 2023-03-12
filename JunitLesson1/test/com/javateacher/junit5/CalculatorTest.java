package com.javateacher.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	void givenTwoNumbers_whenAddition_shouldReturnAnswer() {
		assertEquals(4.0, calculator.addtition(2, 2));
	}

	@Test
	void givenTwoNumbers_whenSubstraction_shouldReturnAnswer() {
		assertEquals(0.0, calculator.substraction(2, 2));
	}

	@Test
	void givenTwoNumbers_whenMultiply_shouldReturnAnswer() {
		assertEquals(40.0, calculator.multiply(20, 2));
	}

	@Test
	void givenTwoNumbers_whenDivide_shouldReturnAnswer() {
		assertEquals(10.0, calculator.divide(20, 2));
	}

}
