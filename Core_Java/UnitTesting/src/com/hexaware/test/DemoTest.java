package com.hexaware.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.hexaware.app.Calculator;

class DemoTest {
	
	static Calculator cal = null;
	
	@BeforeAll // @BeforeClass
	public static void  beforeAll() {
		
		cal = new Calculator();
		
		System.out.println("Before All executed...");
		//any initialization work like creating objects, getting DB Conn , read files
	}
	
	

	@ParameterizedTest
	@ValueSource(strings = {"king","tom","black smith","javeed"})
	void test1(String name) {
		
		
				assertTrue( name.length() > 1);
				
				System.out.println("test1");
		
		
	}
	
	@DisplayName(value = "(:")
	@RepeatedTest(value = 5)
	public void  test2() {
		
		
		
			assertEquals(10, cal.add(5, 5));
		
			System.out.println("test2");
		
	}
	
	@Test
	public void test3() {
		
		
		assertTrue(true);
		System.out.println("test3");
	}
	
	
	
	@AfterAll //  AfterClass
	public static void afterAll() {
		
		// post construct code like cleaning memory , close files , close DB Conn etc
		
		System.out.println("After All executed..");
		
	
	}
	
	@Test
	public void testExp() {
		
			
			String name = null;
		
			boolean flag = false;
				try {
					
					name.length();
					
				}
				catch (NullPointerException e) {
					
					flag = true;
				}
		
			assertTrue(flag);	
		
	}
	
	
	
	
	

}
