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

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		for(int j = 0; j<M; j++) {
			int left=0;
			int right=arr.length;
			boolean fo = false;
			int target = Integer.parseInt(stt.nextToken());
			while(left<right) {
				int mid = (left+right)/2;
				if(arr[mid]==target) {
					fo = true;
					break;
				} 
				else if(arr[mid]>target) {
					right=mid;
				}
				else {
					left= mid+1;
				}
			}
			bw.write(fo ? 1+" " : 0+" ");
		}
		
		bw.flush();
		bw.close();
	}
}