import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String a = (br.readLine());
			StringTokenizer st = new StringTokenizer(a);
			int k = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			if(k>j) {
				k=j+1;
				bw.write(k+j+"");
			}
			else if(j>=k) {
				j=k+1;
				bw.write(k-2+j+"");
			}else
			bw.write(k+j+"");
		bw.flush();
		bw.close();
	}
}