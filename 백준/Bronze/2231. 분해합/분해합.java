import java.util.Scanner;

public class Main{
    public static int findAssemble(int num){
        int sum = num;
        while(num>0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt(); //분해합
        sc.close();
        int res = 0; //생성자 저장, 만약 없으면 0
        for(int i = 0; i<sum; i++){
            int find = findAssemble(i);
            if(sum == find){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}