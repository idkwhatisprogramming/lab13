package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void test() {
		JTestUnit maxT = new JTestUnit();
		int[] m_array =  {5,6,8,1,5};
		int output = maxT.max(m_array);
		assertEquals(8,output);
		
	}
}
