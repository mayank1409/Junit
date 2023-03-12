package com.javateacher.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void givenNumeAndDeno_WhenDivide_shouldReturnAnswer() {
		assertEquals(5.0, MathUtils.divide(10.0, 2.0));
	}
	
	@Test
	void givenDenoAsZero_WhenDivide_ShouldThrowException() {
		assertThrows(IllegalArgumentException.class, () -> {
			MathUtils.divide(10.0, 0.0);
		});
	}

}
