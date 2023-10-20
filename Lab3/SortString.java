package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	static void sortString(String [] s)
	{
			Arrays.sort(s);
			for(String s2:s) {
				System.out.println(s2);
			}
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []s1= new String[5];
		
		for(int i=0; i<s1.length; i++) {
			System.out.println("Enter the input strings");
			s1[i]=sc.next();
		}
		sortString(s1);
		
		
		

	}

}
