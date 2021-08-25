package assignment.week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String  str="PayPal India";
		char[] ch = str.toCharArray();
		
Set<Character> charSet=new LinkedHashSet<Character>();
Set<Character> dupCharSet=new LinkedHashSet<Character>();
for(int i=0;i<ch.length-1;i++) {
	
	if(charSet.contains(ch[i]) )  {
		dupCharSet.add(ch[i]);
	}
		else
		{
			charSet.add(ch[i]);
		}
	}
charSet.remove(' ');
System.out.println("charset"+charSet);
System.out.println("dupCharSet"+dupCharSet);
}
			}


