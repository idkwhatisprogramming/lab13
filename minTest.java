package lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class minTest {

	@Test
	public void test() {
		JTestUnit minT = new JTestUnit();
		int[] m_array =  {5,6,8,1,5};
		int output = minT.min(m_array);
		assertEquals(1,output);
	
	}
}
