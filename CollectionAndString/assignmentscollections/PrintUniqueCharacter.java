package assignmentscollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String a="babu";
		char[] charArray = a.toCharArray();
		Set<Character> set=new HashSet<Character>();
		HashSet<Character> set2=new HashSet<Character>();
	    for(char i:charArray) {
	    	if(set.contains(i))
	        {
	            set.add(i);
	            set2.remove(i);
	            
	        }
	        else
	        {
	            
	            set.add(i);
	            set2.add(i);
	        }
	    }
	    
	    System.out.println(set2); 

	}

}



