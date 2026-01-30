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
				for(int i =0; i<M; i++) {
					int left= 0;
					int right = arr.length;
					int target = Integer.parseInt(stt.nextToken());
					while(left<right) {
						int mid = (left+right)/2;
						if(arr[mid]>=target) {
							right=mid;
						} else left=mid+1;
					} int low=left;
					left =0;
					right=arr.length;
					while(left<right) {
						int mid =(left+right)/2;
						if(arr[mid]>target) {
							right=mid;
						} else left =mid+1;
					}
					int high= left;
					bw.write(high-low+" ");
				}
		bw.flush();
		bw.close();
	}
}