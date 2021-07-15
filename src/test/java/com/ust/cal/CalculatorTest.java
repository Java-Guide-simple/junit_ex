package com.ust.cal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		
		assertEquals(18,c.add(9, 9),"valid");
	}
	
	@Test
	public void mulTest() {
		Calculator c = new Calculator();
		
		assertEquals(81,c.mul(9, 9),"valid");
	}

}
