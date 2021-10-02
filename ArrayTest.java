import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
    @Before
    public void BeforeTest()
    {
    	Array arr=new Array();
    }
	@Test
	public void ArrayInsertionTest() {
		
	    Array.insert(1, 0);
		Array.insert(2, 1);
		assertEquals(2,Array.array[1]);
	}
	@Test
	public void ArrayDeletionTest()
	{
		Array.insert(0, 0);
		Array.delete(0);
		assertEquals(0,Array.array[0]);
	
	}
	@Test
	public void ArrayLinearSearchTest()
	{
		Array.insert(0, 0);
		assertEquals(true,Array.linearSearch(0));
		
		
	}
	@Test
	public void ArrayBinarySearchTest()
	{
		Array.insert(0, 0);
		assertEquals(true,Array.binarySearch(0, 0, 0));
		
		
	}
	@Test
	public void ArrayBubbleSortTest()
	{
		Array.insert(5, 0);
		Array.insert(2,0);
		Array.bubbleSort();
		assertEquals(2,Array.array[0]);
		
		
	}

}
