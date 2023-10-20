package Lab3;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfString {
	 static void arrayofString(String [] s) {
		for (int i = 0; i < s.length; i++) {
			
			String s2=s[i];
			
			int n=s2.length();
			
			if(n%2==0) {
				String ups=s2.substring(0,n/2 ).toUpperCase();
				System.out.println(ups+s2.substring(n/2, n));
				
			}else if(n%2==1){
				String ups=s2.substring(0,(n/2+1)).toUpperCase();
				System.out.println(ups+s2.substring((n/2+1), n));
			}
		}
	}

	public static void main(String[] args) {
		
		//String s[]= {"kishore","charan", "moeenakbar"};
		//arrayofString(s);
		
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[4];
		for (int i = 0; i < s1.length; i++) {
			System.out.println("enter the strings");
			s1[i]=sc.next();
		}	
		arrayofString(s1);
		
		
		
		
		

	}

}
