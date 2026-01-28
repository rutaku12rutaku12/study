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
			int i = Integer.parseInt(st.nextToken());
			if(k*j>i) {
				bw.write(k*j-i+"");
			}else bw.write(0+"");
		bw.flush();
		bw.close();
	}
}