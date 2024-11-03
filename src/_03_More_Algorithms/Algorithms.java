package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int ans = num1*num2;
    	String it = num1+" x "+num2+" = "+ans;
        return it;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	
		for( int i = 2; i < eggs.size(); i++) {
		
			if( eggs.get(i) == "cracked") {
				
				return i;
				
		} 
			
		}
		
		return 0;
    }

	public static boolean isPrime(int pr) {
	
		for( int i = 2; i < pr; i++) {
		
			if( pr % i == 0) {
				
				return false;
				
		} 
			
		}
		
		return true;
	}
	


	public static boolean isSquare(int sq) {
		
		for( int i = 0; i <= sq; i++) {
			
			if( i * i == sq) {
				
				return true;
				
		} 
			
		}
		
		return false;
	}

	public static boolean isCube(int cb) {
		for( int i = 0; i <= cb; i++) {
			
			if( i * i * i == cb) {
				
				return true;
				
		} 
			
		}
		
		return false;
	}
}
