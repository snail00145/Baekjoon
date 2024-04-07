import java.util.*;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            queue.offer(i); //삽입
        }
        
        for(int i = 1; queue.size() > 1; i++){
            queue.poll(); //삭제
            int front = queue.poll(); //앞에 값 저장하고 삭제
            queue.offer(front); //맨뒤에 그 값 넣음
        }
        
        System.out.println(queue.peek());
    }
}