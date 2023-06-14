package assignmentscollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
				/*
				 * int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> cha = new TreeSet<Integer>();
		for(int i = 0; i<data.length; i++)
		{
			cha.add(data[i]);
		}
		List<Integer> intList = new LinkedList<Integer>();
		intList.addAll(cha);
			System.out.println(intList.get(intList.size()-2));
		}
		
}