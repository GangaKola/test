package com.test.Assignment;

import java.util.HashSet;
import java.util.Scanner;

/**
 * A class which finds the valid english words from the all the permutations and combinations of given string
 *
 */
public class Combinations 
{
	private StringBuilder output = new StringBuilder();
	private static String inputstring;
	public Dictionary dictionary;
	
	/**
	 * Created a dictionary class object in constructor
	 */
	public Combinations() {
		dictionary = new Dictionary();
	}
	
	 /**
	 * Supporting method for permutation
	 */
	public void combine() { combine( 0 ); }
	  
	  /**
	   * This method works on permutations and adds value to result set when it is available in english dictionary
	 * @param start - index of the char in the string
	 * 
	 */
	private void combine(int start){
		
		  HashSet<String> result = new HashSet<String>();  // Store the valid dictionary words without duplicates 
		  
	        for( int i = start; i < inputstring.length(); ++i ){  //Running through length of the input string
	            output.append( inputstring.charAt(i) );  
	            if(output.length()>1 && dictionary.isEnglishWord(output.toString())) {  //Avoiding words with one letter and invalid english words
	            	result.add(output.toString());   // Adding to result set
	            }
	            if ( i < inputstring.length() )
	            combine( i + 1);
	            output.setLength( output.length() - 1 );
	        }
	        
	        for(String ele : result) {
	        	System.out.println(ele);
	        }
	    }
	
	
    public static void main( String[] args )
    {
        System.out.println("Please Enter the String..");
        
		Scanner scan =  new Scanner(System.in);
		
		inputstring = scan.nextLine();
		
    	Combinations combobj= new Combinations();
        
        combobj.combine();
        
    }
}
