import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int s = sc.nextInt(); //전체 반복 수
		
		for (int repeat = 0; repeat < s ;repeat++)
		{
        int r = sc.nextInt(); //글자 반복 수
        String str = sc.next(); //해당 string
        	for(int i = 0; i < str.length();i++)
        	{
        		for(int j = 0; j < r;j++)
        			System.out.print(str.charAt(i));
	        }
        	System.out.println();
		}
		sc.close();
	
	}
}
