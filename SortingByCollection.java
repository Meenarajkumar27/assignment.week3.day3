package assignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> companyname=new ArrayList<String>();
companyname.add("Aspire systems");
companyname.add("cts");
companyname.add("wipro");
companyname.add("HCL");
int companysize=companyname.size();
System.out.println("Length of the Array : "+companysize);
Collections.sort(companyname);
System.out.println("Sorted Array" + companyname);
System.out.println("Reverse the Array");
for(int i=companysize-1;i>=0;i--) {
	System.out.print(companyname.get(i)+" ");
}

}

	}


