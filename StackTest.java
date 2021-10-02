import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
    @Before
    public void BeforeTest()
    {
    	Stack S=new Stack();
    }
	@Test
	public void testPush() {
		Stack.push(0);
		assertEquals(0,Stack.top());
		
	}
	@Test
	public void testPop() {
		Stack.push(0);
		Stack.pop();
		assertEquals(-1,Stack.top());
		
	}

}
