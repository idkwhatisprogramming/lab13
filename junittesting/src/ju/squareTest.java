package ju;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.square(5);
		assertEquals(25, output);

	}

}
