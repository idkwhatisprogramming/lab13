package junittesting1;

import static org.junit.jupiter.api.Assertions.*;


class squaretest {
	
	void test() {
		junittesting obj=new junittesting();
		int output=obj.square(5);
		assertEquals(25, output);
	}

}
