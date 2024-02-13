import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int add;
		String str;
		
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			add = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			System.out.println(add);
		}
	}

}
