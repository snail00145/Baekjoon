import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su = Integer.parseInt(br.readLine());
		String[] str = new String[su];
		for(int i = 0; i < su; i++) {
			str[i] = br.readLine();
		}

		//sort 함수 재정의
		//comparator는 인터페이스로, Compare(T o1, To2)를 구현해야한다.
		//comparator는 두 매개변수 객체를 비교한다.
		//Comparator가 음수를 반환하면 바꾸지 않는다.
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2); //길이가 같다면 사전순
				} else {
					return s1.length() - s2.length(); //아니라면 길이차(양수,음수) 반환
				}
			}
		});
	
		
		System.out.println(str[0]);
		for(int i = 1; i < su; i++) {
			if(str[i].equals(str[i - 1])) continue;
			System.out.println(str[i]);
		}
		
	}
}
