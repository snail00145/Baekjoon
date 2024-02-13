import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0); //next는 char을 입력받지 못하기에 charAt을 사용
        int ascii;
        ascii = (int)c;
        System.out.println(ascii);
        sc.close();
    }
}