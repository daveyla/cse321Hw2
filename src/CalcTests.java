import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTests {

	@Test
	public void testAdd() {
		assertEquals(200, Calc.add(100, 100));
		assertEquals(11, Calc.add(5, 6));
		assertEquals(3, Calc.add(1, 2));
	}

	@Test
	public void testSubtract() {
		assertEquals(-5, Calc.subtract(-10, -5));
		assertEquals(5, Calc.subtract(10, 5));
		assertEquals(3, Calc.subtract(5, 2));
	}
	
	@Test 
	public void testMultiply() {
		assertEquals(6, Calc.multiply(2, 3));
		assertEquals(25, Calc.multiply(5, 5));
		assertEquals(-15, Calc.multiply(3, -5));
	}
	
	@Test
	public void testDivide() {
		//floating point numbers require a "delta" value (0)
		assertEquals(5.5, Calc.divide(11, 2), 0);
		assertEquals(6, Calc.divide(12, 2), 0);
		assertEquals(0.125, Calc.divide(1, 8), 0);
	}
	
}
