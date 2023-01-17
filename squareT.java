package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareT {

	@Test
	public void test() {
		JTest obj=new JTest();
		int output=obj.square(5);
		assertEquals(25, output);

	}

}
