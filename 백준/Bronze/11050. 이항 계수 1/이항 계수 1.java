import java.util.Scanner;

public class Main {
	public static int fact(int n) {
		int fact = 1;
		for (int i = n; i>0; i--) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(fact(n)/(fact(n-k)*fact(k)));
		
	}
}
