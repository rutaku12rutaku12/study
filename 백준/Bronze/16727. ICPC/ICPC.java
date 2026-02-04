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
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer p1 = Integer.parseInt(st.nextToken());
		Integer s1 = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		Integer s2 = Integer.parseInt(st2.nextToken());
		Integer p2 = Integer.parseInt(st2.nextToken());
		
		if(p1+p2>s1+s2) {
			bw.write("Persepolis");
		}
		else if(p1+p2<s1+s2) {
			bw.write("Esteghlal");
		}
		else if(p1+p2==s1+s2) {
			if(s1 < p2) {
				bw.write("Persepolis");
			}else if(s1>p2) {bw.write("Esteghlal");}
			else {bw.write("Penalty");}
		}
		bw.flush();
		bw.close();
	}
}