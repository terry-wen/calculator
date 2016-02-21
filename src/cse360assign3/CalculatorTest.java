package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		
		calc.add(5);
		
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		
		calc.subtract(5);
		
		assertEquals(-5, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		
		calc.add(1);
		calc.multiply(5);
		
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		
		calc.add(6);
		calc.divide(2);
		
		assertEquals(3, calc.getTotal());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		
		calc.add(1);
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testHistory() {
		Calculator calc = new Calculator();
		
		calc.add(7);
		calc.subtract(3);
		calc.multiply(2);
		calc.divide(4);
		
		assertEquals("0 + 7 - 3 * 2 / 4", calc.getHistory());
	}
}
