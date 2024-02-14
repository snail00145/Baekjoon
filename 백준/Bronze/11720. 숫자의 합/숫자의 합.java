import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//자릿값 반환 방법을 어떻게 짜야할지 몰라서 split사용
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] str2= str.split("|");
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			sum += Integer.parseInt(str2[i]);
		}
		System.out.println(sum);
	}
	
}
