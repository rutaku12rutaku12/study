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
		
		boolean is = true;
		while(is) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			int A = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
	
			if(N.equals("#") && A==0 && W ==0) {
				is= false;
				break;
			}
			if(A>17 || W>=80) {
				bw.write(N+" Senior\n");
			}else {
				bw.write(N+" Junior\n");
			}
		}
		bw.flush();
		bw.close();
	}	
}