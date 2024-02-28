import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int gcd = 0;
        int min = 0;
        if(a <= b) min = a;
        else min = b;
        
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0) gcd = i;
        }
        
        int lcm = 0;
        lcm = a * b / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
}