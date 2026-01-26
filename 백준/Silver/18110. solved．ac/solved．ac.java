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

			double N = Double.parseDouble(br.readLine());
			double J = Math.round(N/100*15);
			
			int j = (int)J;
			double sum = 0;
			double [] arr = new double[(int)N];
			for(int i=0;i<N;i++) {
				arr[i] = Double.parseDouble(br.readLine());
			}
			Arrays.sort(arr);
			for(int i=0;i<N;i++) {
				if(i<Math.round(0+j) || i>=Math.round(N-j)) {
					continue;
				}
				sum+= arr[i];
				//bw.write("i:"+i+", sum:"+sum+"\n");
			}
			
			int rsum=(int)Math.round(sum/(N-2*j));
			bw.write(rsum+"");
			
		bw.flush();
		bw.close();
	}
}