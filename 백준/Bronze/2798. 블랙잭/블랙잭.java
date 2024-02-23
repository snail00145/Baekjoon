import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static int findMax(int[] card, int N, int M){
        int res = 0;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    int tmp = card[i] + card[j] + card[k];
                    //카드합 = 최대합
                    if (tmp == M) return tmp;
                    //카드합이 이전합보다 크고 최대합보다 작으면
                    if (tmp > res && tmp < M) res = tmp;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken()); //카드개수
        int M = Integer.parseInt(st.nextToken()); //합
        int card [] = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            card[i] = Integer.parseInt(st.nextToken()); //배열에 카드 넣기
        }
        int res = findMax(card, N, M);
        System.out.println(res);
    }
}