import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
   @Before
   public void beforeTest()
   {
	   LinkedList listObj=new LinkedList();
   }
	@Test
	public void TestPushFront()
	{
		LinkedList.pushFront(0);
		LinkedList.pushFront(1);
		assertEquals(1,LinkedList.head.key);
		
	}
	@Test
	public void TestPushBack()
	{
		LinkedList.pushBack(0);
		LinkedList.pushBack(1);
		assertEquals(0,LinkedList.head.key);
		
	}
	@Test
	public void TestPopFront()
	{
		LinkedList.popFront();
		
		assertEquals(null,LinkedList.head);
		
	}
	@Test
	public void TestPopBack()
	{
		LinkedList.popBack();
		
		assertEquals(null,LinkedList.head);
		
	}

}
