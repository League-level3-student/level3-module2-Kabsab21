package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
		int[] Arr = { 0 , 1 , 2 , 3 , 4 , 5 };
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method.
        assertEquals( 2, _01_LinearSearch.linearSearch( Arr, 2));
      
    }

  
		
	

	@Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(3, _02_BinarySearch.binarySearch(Arr, 0, 5, 3) );
    }
}


