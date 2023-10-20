package com.cg;

public class SumOfCubes {
	public static int SumOfDigitCubes(int n) {
		int sum=0;
		while(n>0) {
			int digit=n%10; // brings last digit
			int cube = digit*digit*digit; //cube
			sum= sum+cube; //
			n= n/10;//remove last digit of number
		}
		return sum;
	}

	public static void main(String[] args) {
		int number=12345;
		int result=SumOfDigitCubes(number);
		System.out.println("sum of cubes of digits "+ result);
	}

}
