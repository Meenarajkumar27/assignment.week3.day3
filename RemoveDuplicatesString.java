package assignment.week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String result=" ";
		String[] text1=text.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(text1) );
		
		for(String text2 : set) {
			result=result+text2+" ";
		}

System.out.println("Sentence after removing duplicate words: " + result);
}
}
