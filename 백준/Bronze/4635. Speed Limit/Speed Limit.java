import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==-1) {
				break;
			}
			int [] arr = new int [N];
			int [] time = new int [N];
			for(int i=0; i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[i] =a;
				time[i] =b;
			}
			int miles =0;
			for(int i=0; i<N; i++) {
				if(i==0) {
					miles += arr[i]*time[i];
				}else miles += arr[i]*(time[i]-time[i-1]);
			}
			bw.write(miles+" miles"+"\n");
		}
		bw.flush();
		bw.close();
	}
}