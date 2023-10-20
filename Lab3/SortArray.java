package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static String[] sortArray(int [] inputArray) {
		String []str= new String[inputArray.length];
		for(int i=0; i<inputArray.length; i++) {
			str[i]=String.valueOf(inputArray[inputArray.length-1-i]);
			}
		Arrays.sort(str);
		return str;
		
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter the numbers");
			arr[i]=sc.nextInt();
		}
		String [] sortedReversedArray=sortArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedReversedArray));
		
		
		}

}
