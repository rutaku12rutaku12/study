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

		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		StringBuilder result = new StringBuilder();
		
		for(int i =0; i<N;i ++) {
			char c = S.charAt(i);
			
			if(c != 'J' && c!='A' &&c!='V' ) {
				result.append(c);
			}
		}
		if(result.length()==0) {
			bw.write("nojava");
		}
		bw.write(result+"");
		bw.flush();
		bw.close();
	}
}