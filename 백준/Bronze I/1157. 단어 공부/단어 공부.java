import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase(); //대문자로 출력해야함
        int alphaCount[] = new int[26]; //알파벳 총 26개
        int num = 0; //알파벳 위치
        //개수 카운트
        for(int i = 0; i < str.length() ; i++){
            num = str.charAt(i) - 'A';
            alphaCount[num]++;
        }
        int max = -1;
        char res = '?';
        //최다빈도 알파벳
        for(int j = 0; j < alphaCount.length ; j++){
            if(max < alphaCount[j]){
                max = alphaCount[j];
                res = (char)(j + 'A');
            }
            else if (max == alphaCount[j]){
                res = '?';
            }
        }
        System.out.println(res);
        
        
    }
}