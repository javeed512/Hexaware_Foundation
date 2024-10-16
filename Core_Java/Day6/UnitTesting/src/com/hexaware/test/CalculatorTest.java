package com.hexaware.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hexaware.app.Calculator;

class CalculatorTest {

	static Calculator cal = null;
	
	@BeforeAll
	public static void  beforeAll() {
		
		cal = new Calculator();
		
		System.out.println("Before All executed...");
		//any initialization work like creating objects, getting DB Conn , read files
	}
	
	
	@AfterAll
	public static void afterAll() {
		
		// post construct code like cleaning memory , close files , close DB Conn etc
		
		System.out.println("After All executed..");
		
		
		
	}
	
	
	
	@BeforeEach
	public void  init() {
		
		System.out.println("Before Each..");
		
	}
	
	@AfterEach
	public void  destroy() {
		
		System.out.println("After Each..");
		
	}
	

	@Test
	@DisplayName("Add")
	void testAdd() {

		int actual = cal.add(15, 5);

		assertEquals(20, actual);
		
		System.out.println("add test");

	}

	@DisplayName("Substraction")
	@Test
	void testSub() {

		
			int actual =  cal.sub(25, 5);
		
				assertTrue(actual > 0);
				System.out.println("sub test");
	}

	@Test
	@Disabled
	void testMul() {
		
		
			int res =  cal.mul(2, 3);
				
			assertNotEquals(res, 5);

			System.out.println("mul test");
			
	}

	@Test
	void testDiv() {
		
			int res = cal.div(100, 10);
			
				assertFalse(res < 0);
		
				System.out.println("div test");

	}

}
