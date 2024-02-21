import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int room = 1;
        int n = 1;
        
        //벌집은 1x6, 2x6, ..., nx6의 갯수로 늘어난다.
        for(int i = 1; i < num; n++){
            i = i + (n*6);
            room++;
        }
        System.out.println(room);
        
    }
}