package Lab3;
import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallest {
	
	static int GetsecondSmallest() {
		int arr[]= {4,9,56,34,96,91,2,85,84,3};
		Arrays.sort(arr);
		int S=arr[1];
		return S;
		}

	public static void main(String[] args) {
		System.out.println(GetsecondSmallest());
		

	}

}
