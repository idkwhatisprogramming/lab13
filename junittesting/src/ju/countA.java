package ju;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countA {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("munazza");
		assertEquals(2, output);

	}

}
