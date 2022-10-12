package week1.day3;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=1;
		int n2=3;
		int n3;
		System.out.println(n1+""+n2);
		for (int i=7;i<=8;i++) {
			n3=n1+n2;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
		}
	}
}
