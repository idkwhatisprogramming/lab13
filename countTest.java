package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	@Test
	public void test() {
		JTest count = new JTest();
		int output = count.countA("Aliyan");
		assertEquals(2, output);
		
	}
}
