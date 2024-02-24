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
        
        int sum = 0;
        int hash = 1;
        for(int j = 0; j < num; j++){
            sum += ((int)ch[j] - 'a' + 1) * hash;
            hash *= 31;
        }
        System.out.println(sum);
        
    }
}