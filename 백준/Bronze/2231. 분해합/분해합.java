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

		int N = Integer.parseInt(br.readLine());
		int result =0;
		for(int i=1; i<N;i++) {
			int sum=i;
			int tem=i;
			while(tem>0) {
				sum+=tem%10;
				tem=tem/10;
			}
			if(sum==N) {
				result = i;
				break;
			}
		}
		bw.write(result+"");
		bw.flush();
		bw.close();
	}
}