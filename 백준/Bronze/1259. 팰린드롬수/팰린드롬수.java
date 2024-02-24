import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;
            int length = str.length();
            
            boolean check = true;
            for(int i = 0; i < length; i++){
                if(str.charAt(i) != str.charAt(length - i - 1)){
                    check = false;
                    break;
                }
            }
            if(check == true) System.out.println("yes");
            else System.out.println("no");
     
        }
    }
}