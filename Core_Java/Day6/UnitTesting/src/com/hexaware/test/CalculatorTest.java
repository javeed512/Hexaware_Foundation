package com.hexaware.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hexaware.app.Calculator;

class CalculatorTest {

	Calculator cal = new Calculator();

	@Test
	@DisplayName("Add")
	void testAdd() {

		int actual = cal.add(15, 5);

		assertEquals(20, actual);

	}

	@DisplayName("Substraction")
	@Test
	void testSub() {

		
			int actual =  cal.sub(25, 5);
		
				assertTrue(actual > 0);
		
	}

	@Test
	@Disabled
	void testMul() {
		
		
			int res =  cal.mul(2, 3);
				
			assertNotEquals(res, 5);

	}

	@Test
	void testDiv() {
		
			int res = cal.div(100, 10);
			
				assertFalse(res < 0);
		

	}

}
