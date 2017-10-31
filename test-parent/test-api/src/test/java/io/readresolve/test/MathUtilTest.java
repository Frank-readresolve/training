
package io.readresolve.test;

import static io.readresolve.test.MathUtil.getVal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jmche
 */
public class MathUtilTest {
	
	@Test
	public void testConstructor() {
		MathUtil math = null;
		assertEquals(null,math);
	}
	
	@Test
	public void testGetVal() {
		assertEquals(getVal(),5);
	}

	@Test
	public void testSum() {
		int x = 2;
		int y = 4;
		int expResult = 6;
		int result = MathUtil.sum(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testMax() {
		int x = 5;
		int y = 4;
		int expResult = 5;
		int result = MathUtil.max(x, y);
		assertEquals(expResult, result);

	}
	
	@Test
	public void testMaxOk() {
		int x = 5;
		int y = 7;
		int expResult = 7;
		int result = MathUtil.max(x, y);
		assertEquals(expResult, result);

	}
	
	@Test (expected = AssertionError.class)
	public void testMaxFail() {
		int x = 5;
		int y = 7;
		int expResult = 5;
		int result = MathUtil.max(x, y);
		assertEquals(expResult, result);

	}
	
	@Test
	public void testMinOk() {
		int x = 6;
		int y = 4;
		int expResult = 6;
		int result = MathUtil.min(x, y);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testMin() {
		int x = 3;
		int y = 4;
		int expResult = 4;
		int result = MathUtil.min(x, y);
		assertEquals(expResult, result);
	}
	
	@Test (expected = AssertionError.class)
	public void testMinFail() {
		int x = 6;
		int y = 4;
		int expResult = 4;
		int result = MathUtil.min(x, y);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsGreaterOk() {
		int other = 6;
		boolean result = MathUtil.isGreater(other);
		assertTrue(result);
	}
	
	@Test (expected = AssertionError.class)
	public void testIsGreaterFail() {
		int other = 6;
		boolean result = MathUtil.isGreater(other);
		assertFalse(result);
	}
	
}
