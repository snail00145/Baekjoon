import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int i = 0;
		int j = 0;
		
		for(i = 0; i <= a; i++)
		{
			for(j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			if(i==j && i!=0)System.out.println();
		}
	}
}