import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringTokenizer jj = new StringTokenizer(br.readLine());
			Queue<int[]> qu = new LinkedList<>();
			for(int j=0; j<N;j++) {
				int priority = (Integer.parseInt(jj.nextToken()));
				qu.add(new int[] {priority,j});
			}
			int order =0;
			while(!qu.isEmpty()) {
				int [] cur = qu.poll();
				boolean bol = false;
				for(int[]aa : qu) {
					if(aa[0]>cur[0]) {
						bol=true;
						break;
					}
				}
				if(bol) {
					qu.add(cur);
				}
				else {
					order++;
					if(M==cur[1]) {
						bw.write(order+"\n");
						break;
					}
				}
			}
		}
		bw.flush();
		bw.close();
	}
}