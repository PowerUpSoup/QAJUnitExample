package com.qa.ExampleJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	@DisplayName("Test calculateAdd()")
	public void testAdd() {
		assertEquals(10, Calculator.calculateAdd(5, 5), "here is a message.");
	}

}
