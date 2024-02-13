import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		int sum;
		int num1;
		int num2;
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			 str = br.readLine();
			 st = new StringTokenizer(str);
			 num1 = Integer.parseInt(st.nextToken());
			 num2 = Integer.parseInt(st.nextToken());
			 
			 if(num1 == 0 && num2 == 0)
				 break;
			 
			 sum = num1+num2;
			 sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}
