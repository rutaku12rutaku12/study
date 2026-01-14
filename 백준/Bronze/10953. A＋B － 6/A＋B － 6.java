
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		for(int i =0; i<A; i++) {
			String K = br.readLine();
			StringTokenizer st = new StringTokenizer(K,",");
			int Q = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			bw.write(P+Q+"\n");
		}
		bw.flush();
		bw.close();
	}
}