import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int re = 0;
			for(int j=0;j<N;j++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(stt.nextToken()); //속력
				int f = Integer.parseInt(stt.nextToken()); //연료량
				int c = Integer.parseInt(stt.nextToken()); //효율
				if(D*c<=f*v) {
					re++;
				}
			}bw.write(re+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
