package com.javateacher.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringsFunTest {

	private StringsFun fun;

	@BeforeEach
	void setUp() throws Exception {
		fun = new StringsFun();
	}

	@Test
	void givenString_whenLength_ShouldReturnAnswer() {
		assertEquals(5, fun.length("Hello"));
	}

	@Test
	void givenNullString_whenLength_ShouldReturnZero() {
		assertEquals(0, fun.length(null));
	}

	@Test
	void givenEmptyString_whenLength_ShouldReturnZero() {
		assertEquals(0, fun.length(""));
	}

	@Test
	void givenString_whenUpperCase_ShouldReturnAnswer() {
		assertEquals("HELLO", fun.convertToUpperCase("Hello"));
	}

	@Test
	void givenNullString_whenUpperCase_ShouldReturnNull() {
		assertEquals(null, fun.convertToUpperCase(null));
	}

	@Test
	void givenEmptyString_whenUpperCase_ShouldReturnEmpty() {
		assertEquals("", fun.convertToUpperCase(""));
	}
	
	@Test
	void givenString_whenLowerCase_ShouldReturnAnswer() {
		assertEquals("hello", fun.convertToLowerCase("Hello"));
	}

	@Test
	void givenNullString_whenLowerCase_ShouldReturnNull() {
		assertEquals(null, fun.convertToLowerCase(null));
	}

	@Test
	void givenEmptyString_whenLowerCase_ShouldReturnEmpty() {
		assertEquals("", fun.convertToLowerCase(""));
	}
}
