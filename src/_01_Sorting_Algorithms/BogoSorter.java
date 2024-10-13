package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	System.out.println("RUN ");
    		Random r = new Random();
    		  Random ro = new Random();
    	for( int i : array) {
    		System.out.println(array[i]);
//    		if( array[i] <= array[i+1]) {
// //   			System.out.println("fine");
//   	} else if ( array[i] > array[i+1] ){
//    			System.out.println("swap");
//    		
//    			int l = r.nextInt(250);
//    		  System.out.println(l);
//    			int ln = ro.nextInt(250);
//    			System.out.println(ln);
//    			int ra = array[l];
//    			int ar = array[ln];
//    			array[ln] = ra;
//    			array[l] = ar;
//    			
//    		} else if ( i == 250 ) {
//    			System.out.println("??");
//    		}
    	}
    		
    }
    
    
    
}
