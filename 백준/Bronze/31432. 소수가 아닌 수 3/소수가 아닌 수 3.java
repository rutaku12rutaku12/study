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

		int N =Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = -1;
		for(int i=0;i<N;i++) {
			int d = Integer.parseInt(st.nextToken());
			if(first==-1) first=d;
			if(d==0||d==1||d==4||d==6||d==8||d==9) {
				bw.write("YES\n");
				bw.write(d+"\n");
				bw.flush();
				return;
			}
		}
		bw.write("YES\n");
		bw.write(""+first+first+"\n");
		bw.flush();
		bw.close();
	}
	
}