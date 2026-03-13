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
	static BufferedWriter bw;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(stt.nextToken());
		int d = Integer.parseInt(stt.nextToken());
		while(b>0 && d>0) {
			b-=c;
			d-=a;
		}
		if(b<=0 && d>0) {
			bw.write("PLAYER B");
		}
		if(b>0 && d<=0) {
			bw.write("PLAYER A");
		}
		if(b<=0 && d<=0) {
			bw.write("DRAW");
		}
		bw.flush();
		bw.close();
	}
}
