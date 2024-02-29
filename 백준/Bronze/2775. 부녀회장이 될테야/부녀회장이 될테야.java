import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //테스트케이스 수
		int arr[][] = new int [15][15]; //층, 호
		
		for(int i = 0; i < 15; i++) {
			arr[i][1] = 1; //모든 층의 1호는 1명
			arr[0][i] = i; //0층은 i호에 i명
		}
		
		for (int i = 1; i < 15; i++) { //층
			for (int j = 2; j < 15; j++) { //호
				//대각선 끼리 더함, ex) 1층 3호는 0층 3호 + 1층 2호
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine()); //층수
			int n = Integer.parseInt(br.readLine()); //호수
			System.out.println(arr[k][n]);
		}
	}
}
