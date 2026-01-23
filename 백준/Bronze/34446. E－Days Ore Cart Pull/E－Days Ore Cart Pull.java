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

		
		int K = Integer.parseInt(br.readLine());
		int K2 = Integer.parseInt(br.readLine());
		int K3 = Integer.parseInt(br.readLine());
		bw.write(2*K+"");
		bw.flush();
		bw.close();
	}
}