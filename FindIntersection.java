package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s1 = { 3, 2, 11, 4, 6, 7 };
		int[] s2 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> intList = new ArrayList<Integer>(s1.length);
		for (int i : s1)
		{
		    intList.add(i);
		}
		System.out.println(intList);
		List<Integer> intList2 = new ArrayList<Integer>(s2.length);
		for (int i : s2)
		{
		    intList2.add(i);
		}
		System.out.println(intList2);
		intList.retainAll(intList2);
		System.out.println("****Print the first arraylist is match item in both arrays******");
		System.out.println(intList);
	}

}
