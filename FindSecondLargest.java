package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : data)
		{
		    intList.add(i);
		}
		
	   Collections.sort(intList);
	   System.out.println(intList);
	   int sizeofthearray=intList.size();
	   //System.out.println(sizeofthearray);
	   System.out.println("Print second largest : "+intList.get(sizeofthearray-2));
	}

}
