import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            
            if (num1 == 0 && num2 == 0 && num3 == 0){
                break;
            }
            
            num1 *= num1;
            num2 *= num2;
            num3 *= num3;
            
            if (num3 == num1 + num2){
                System.out.println("right");
            }
            else if (num2 == num1 + num3){
                System.out.println("right");
            }
            else if (num1 == num2 + num3){
                System.out.println("right");
            }
            else{
               System.out.println("wrong"); 
            }
        }
        sc.close();
    }
}