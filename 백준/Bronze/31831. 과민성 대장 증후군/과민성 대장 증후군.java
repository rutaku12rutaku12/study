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
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int result = 0;
			int res=0;
			for(int i=0;i<N;i++) {
				int a = Integer.parseInt(stt.nextToken());
				result=Math.max(0, result+a);
				//bw.write(result+" ");
				if(M<=result) {
					res++;
				}
			}
			bw.write(res+" ");
		bw.flush();
		bw.close();
	}
	
}
