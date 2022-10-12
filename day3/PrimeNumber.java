package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=7;
		int count=0;
		if (num<=1) {
		System.out.println("The Number is not prime");
		return;
		}
		for (int i=1;i<=num/2;i++) {
		if (num % i==0) {
			count++;
		}
		}
		if (count >1) {
			System.out.println("The Number is not prime");
		}
		else {
			System.out.println("The Number is prime");
		}
		}
		
}
