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

			int N = Integer.parseInt(br.readLine()); // 상근 가진 카드
				String a =(br.readLine());
				StringTokenizer st = new StringTokenizer(a);
				int [] arr = new int[N];
				for(int i=0; i<N; i++) {	
					arr[i]=(Integer.parseInt(st.nextToken()));
				}
				Arrays.sort(arr);
			int M = Integer.parseInt(br.readLine()); // 비교 숫자대상
				String b =(br.readLine());
				StringTokenizer stt = new StringTokenizer(b);
				for(int q=0; q<M;q++) {
					int A=Integer.parseInt(stt.nextToken());
					int left = 0;
					int right = arr.length;
					while(left<right) {
						int mid = (left+right)/2;
						if(arr[mid]>=A)right=mid;
						else left =mid+1;
					}
					int lower = left;
					
					left = 0;
					right= arr.length;
					while(left < right) {
						int mid = (left+right)/2;
						if( arr[mid]>A) right = mid;
						else left=mid+1;
					}
					int upper = left;
					bw.write((upper-lower)+ " ");
				}
		bw.flush();
		bw.close();
	}
}