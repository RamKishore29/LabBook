package Lab1;

public class SumOfNaturalNumbers {
	 
	static int CalculateSum(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			if(i%3==0 || i%5==0) {
				sum= sum+i;
				}
		} return sum;
		
	}

	public static void main(String[] args) {
		System.out.println(CalculateSum(10));
	}

}
