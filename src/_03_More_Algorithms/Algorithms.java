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

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int containsPearls = 0;
		for( Boolean i : oysters ) {
			if( i == true ) {
				containsPearls = containsPearls+1;
			}
		}
		return containsPearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallest = 0.0;
		for( int i = 0; i < peeps.size(); i++ ) {
			if( i > 0) {
				if( peeps.get(i) > tallest) {
					tallest = peeps.get(i);
				}
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longest = "";
		for( int i = 0; i < words.size(); i++ ) {
			if( i > 0) {
				if( words.get(i).length() > longest.length()) {
					longest = words.get(i);
				}
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		
		for( int i = 0; i < message1.size(); i++ ) {
			if( i > 0) {
				if(  message1.get(i).contains("... --- ...")) {
					return true;
				
				}
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean noswap = true;
		boolean issorted = false;
		
		while(issorted == false ){
			noswap = true;
			 System.out.println("RUNNING??");
		int count = 0;	 
		for(int i = 0; i <  results.size()-1; i++){
			
			 System.out.println("before"+results.get(i)+"size"+results.size());
			 count++;
			 
	if( i < results.size() -1 ) {
			 
			if(results.get(i) > results.get(i+1)) {
				 System.out.println("swap");
				Double n = results.get(i);
				 results.set( i, results.get(i+1));
				 results.set( i+1, n);
				 noswap = false;
				 System.out.println("swap");
				
				 
				}
			}
		}
		
		if(count == results.size()-1 && noswap == true) {
			 System.out.println("sorted");
			issorted = true;
			
		}
		
		}
		
	
		
		
		return results;
	}

	public static Object sortDNA(List<String> un) {
		// TODO Auto-generated method stub
		boolean noswap = true;
		boolean issorted = false;
		
		while(issorted == false ){
			noswap = true;
			 System.out.println("RUNNING??");
		int count = 0;	 
		for(int i = 0; i <  un.size()-1; i++){
			
			 System.out.println("before"+un.get(i)+"size"+un.size());
			 count++;
			 
	if( i < un.size() -1 ) {
			 
			if(un.get(i).length() > un.get(i+1).length()) {
				 System.out.println("swap");
				String n = un.get(i);
				 un.set( i, un.get(i+1));
				 un.set( i+1, n);
				 noswap = false;
				 System.out.println("swap");
				
				 
				}
			}
		}
		
		if(count == un.size()-1 && noswap == true) {
			 System.out.println("sorted");
			issorted = true;
			
		}
		
		}
		return un;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		
		boolean noswap = true;
		boolean issorted = false;
		
		while(issorted == false ){
			noswap = true;
			 System.out.println("RUNNING??");
		int count = 0;	 
		for(int i = 0; i <  words.size()-1; i++){
			System.out.println(words.get(i).charAt(1));
			 System.out.println("before"+words.get(i)+"size"+words.size());
			 count++;
			 
	if( i < words.size() -1 ) {
			 
			if(words.get(i).charAt(0) > words.get(i+1).charAt(0)) {
				 System.out.println("swap");
				String n = words.get(i);
				 words.set( i, words.get(i+1));
				 words.set( i+1, n);
				 noswap = false;
				 System.out.println("swap");
				
				 
				} else if(words.get(i).charAt(0) == words.get(i+1).charAt(0)) {
					 
					if(words.get(i).charAt(1) > words.get(i+1).charAt(1)) {
						 System.out.println("swap");
						String n = words.get(i);
						 words.set( i, words.get(i+1));
						 words.set( i+1, n);
						 noswap = false;
						 System.out.println("swap");
						
						 
						}
				}else if(words.get(i).charAt(1) == words.get(i+1).charAt(1)) {
							 
							if(words.get(i).charAt(2) > words.get(i+1).charAt(2)) {
								 System.out.println("swap");
								String n = words.get(i);
								 words.set( i, words.get(i+1));
								 words.set( i+1, n);
								 noswap = false;
								 System.out.println("swap");
								
								 
								}
						}
				}
			}
	 
		
		
		if(count == words.size()-1 && noswap == true) {
			 System.out.println("sorted");
			issorted = true;
			
		}
		
		}	

		return words;
	}
}
