import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    @Before
    public void BeforeTest()
    {
    	Queue Q=new Queue();
    }
	@Test
	public void testEnqueue()
	{
		Queue.enqueue(1);
		assertEquals(1,Queue.head.key);
	}
	@Test
	public void testDequeue()
	{
		Queue.enqueue(1);
		Queue.dequeue();
		assertEquals(null,Queue.head);
	}

}
