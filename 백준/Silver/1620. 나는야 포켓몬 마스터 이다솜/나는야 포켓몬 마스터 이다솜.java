import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = (br.readLine());
		StringTokenizer st = new StringTokenizer(A);
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String [] arr = new String[M];
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<M; i++) {
			arr[i]=br.readLine();
			map.put(arr[i], i+1);
		}
		for(int i=0; i<N;i++) {
			String a = br.readLine();
			
			if (a.matches("[0-9]+")){  // 스트링이 아니면 숫자로 바꾸고, 해당 숫자 인덱스의 값 출력
				int b= Integer.parseInt(a);
				bw.write(arr[b-1]+"\n");
			}
			else {

						bw.write(map.get(a)+"\n");

			}
		}
		bw.flush();
		bw.close();
	}
}