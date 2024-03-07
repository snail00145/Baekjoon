import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int devil = 666;
		int count = 1;
		
		//브루트포스로 count번쨰의 666포함한 수 찾을 때 까지
		while(count != n) {
			devil++;
			if(String.valueOf(devil).contains("666")) {
				count++;
			}
		}
		System.out.println(devil);
	}
}
