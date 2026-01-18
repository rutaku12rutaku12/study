import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N;i++) {
			
			int a = Integer.parseInt(st.nextToken());
			A[i]=a;
		}
		int M = Integer.parseInt(br.readLine());
		int[] B = new int [M];
		StringTokenizer sta = new StringTokenizer(br.readLine());
		for(int i=0; i<M;i++) {
			int b = Integer.parseInt(sta.nextToken());
			B[i]=b;
		}
		Arrays.sort(A);
		for(int i = 0; i<M;i++) {
			int target = B[i];
			int left = 0;
			int right = N-1;
			boolean found = false;
			
			while (left<=right) {
				int mid = (left+right)/2;
				
				if(A[mid]==target) {
					found = true;
					break;
				} else if (A[mid]<target) {
					left =mid+1;
				}else {
					right = mid -1;
				}
			}
			if(found) bw.write("1\n");
			else bw.write("0\n");
		}
		bw.flush();
		bw.close();
	}
}