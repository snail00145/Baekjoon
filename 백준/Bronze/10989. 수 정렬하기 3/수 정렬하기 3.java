import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int su = Integer.parseInt(br.readLine());
		int[] num = new int[su];
		for(int i = 0; i < su; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for(int i = 0; i < su; i++) {
			sb.append(num[i]).append('\n');
		}
		System.out.println(sb);
}
}
