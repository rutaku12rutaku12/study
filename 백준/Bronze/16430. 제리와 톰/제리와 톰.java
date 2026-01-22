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

		String N = (br.readLine());
		StringTokenizer st = new StringTokenizer(N);
		int T = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		bw.write(Q-T+" "+Q);
		bw.flush();
		bw.close();
	}
}