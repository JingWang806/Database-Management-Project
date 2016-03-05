import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCalculate {
	Calculate cal;
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Test
	public void testadd(){
		int res = cal.add(10, 20);
		assertEquals("Add Wrong!", 30, res);
	}
	
	@Test
	public void testminus(){
		int res = cal.minus(10, 20);
		assertEquals("Minus Wrong!",-10,res);
	}
	
	@Test
	public void testdivide(){
		int res = cal.divide(20, 10);
		assertEquals("Divide Wrong!",2,res);
	}
	
	@Test
	public void testmultiple(){
		int res = cal.multiple(10, 20);
		assertEquals("Multiple Wrong!",200,res);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testdivideException(){
		int res = cal.divide(20, 0);
	}
	
	@Test(timeout=800)
	public void testtime(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res = cal.add(10, 20);
	}
	
	public void testHamcrest(){
		Assert.assertThat(50, allOf(greaterThan(20),lessThan(30)));
	}

	

}
