import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int[] arr = new int[9];
	int point = 0;
	int max = 0;
	
	Scanner input = new Scanner(System.in);
	
	for (int i = 0; i < 9; i++) {
		arr[i]=input.nextInt();	
	}
	for (int i = 0; i < 9 ;i++) {
		if(max < arr[i]) {
			max = arr[i];
			point = i+1;
		}
	}
	System.out.println(max);
	System.out.print(point);
	}
}
