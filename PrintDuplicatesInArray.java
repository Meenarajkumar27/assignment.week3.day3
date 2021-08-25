package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> arrlist = new ArrayList<Integer>();
		for (int i : arr) {
			arrlist.add(i);
		}
		System.out.println("Input Value: " + arrlist);
		Set<Integer> setarray = new HashSet<Integer>();

		// System.out.println("setarray"+setarray);
		for (int i = 0; i < arrlist.size(); i++) {
			for (int j = i + 1; j < arrlist.size(); j++) {
				if (arrlist.get(i) == arrlist.get(j)) {
					setarray.add(arrlist.get(i));
				}
			}
		}

		System.out.println("Duplicate value :" + setarray);
		arrlist.removeAll(setarray);
		arrlist.addAll(setarray);
		Collections.sort(arrlist);

		System.out.println("Remove Duplicate value :" + arrlist);
	}

}
