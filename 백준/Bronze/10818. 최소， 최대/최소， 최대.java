import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 int min = 1000000;
		 int max = -1000000;
		 int num;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N = Integer.parseInt(br.readLine());
		 StringTokenizer st = new StringTokenizer(br.readLine()); //띄어쓰기 기준이므로 공백
	
		 for(int i = 0; i<N; i++) {
			 num = Integer.parseInt(st.nextToken());
			 if (num < min)
				 min = num;
			 if (num > max)
				 max = num;
		 }
		 System.out.println(min + " " + max);
	}
	
}