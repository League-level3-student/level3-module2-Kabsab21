package _01_Sorting_Algorithms;

import java.lang.reflect.Array;
import java.util.Random;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	System.out.println("RUN ");
    	
    	boolean isSorted 
    	arsort(array);
      
 }

    

	int[] arsort( int[] array ) {
    	
	for( int i : array) {
		
		if( array[i] <= array[i+1]) {
			System.out.println(array[i]);
			System.out.println("fine");
		
			
	} else if ( array[i] > array[i+1] ){
		System.out.println(array[i]);
			System.out.println("swap");
			int ra = array[i];
			int ar = array[i+1];
			array[i+1] = ra;
			array[i] = ar;
			System.out.println(array[i]);
			}
		}
	
		for( int i : array ) {
    		System.out.println(array[i]);
    	}
		return array;
	}
	
}


