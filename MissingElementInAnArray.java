package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> listarray=new ArrayList<Integer>();
		for(int i : arr) {
			listarray.add(i);
		}
		for(int i=0;i<=listarray.size();i++) {
			if (listarray.get(i) != i + 1){
				System.out.println(i + 1);
				break;
			}
		}

	}

}
