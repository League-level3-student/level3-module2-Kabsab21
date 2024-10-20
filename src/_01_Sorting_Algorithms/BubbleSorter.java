package _01_Sorting_Algorithms;

import java.lang.reflect.Array;
import java.util.Random;

public class BubbleSorter extends Sorter{
	boolean movedItems = false;
	boolean isSorted = false;
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
    	
    
    	while(isSorted==false) {
    		
    
    		arsort(array);
    		
    		
    	}

 }

    

	int[] arsort( int[] array ) {
    	int counter = 0;
	for( int i : array) {
		
		if( i <= 248) {
		
		
		if ( array[i] > array[i+1] ){
	
		System.out.println(array[i]);
			System.out.println("swap");
			int ra = array[i];
			int ar = array[i+1];
			array[i+1] = ra;
			array[i] = ar;
			System.out.println(array[i]);
			movedItems = true;
			counter++;
			}
		
		
	}
	}

	if( counter == 248 && movedItems == false ) {
		System.out.println("AHHHHHHHHHHHHHHHHHHHHHHH");
		isSorted = true;
	}
	
		return array;
	}
	
}


