import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int su = Integer.parseInt(br.readLine());
        double[] num = new double [su];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        for(int i = 0; i < su; i++){
            num[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(num);
        double sum = 0;
        for(int j = 0; j < su; j++){
            sum += num[j] / num[su - 1] * 100;
        }
        System.out.println(sum / su);
    }
}