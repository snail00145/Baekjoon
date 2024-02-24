import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //글자수
        String str = br.readLine();
        char[] ch = new char[num];
        for(int i = 0; i < num; i++){
            ch[i] = str.charAt(i);
        }
        
        long sum = 0;
		long hash = 1;
		for (int j = 0; j < num ;j++) {
			sum += ((ch[j] - 'a' + 1) * hash);
			//곱해줄때마다 1234567891을 나눠주면 long을 넘지 않음
			hash = (hash * 31) % 1234567891;
			
		}
		System.out.println(sum % 1234567891);
        
    }
}