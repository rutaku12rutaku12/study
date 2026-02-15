
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
	
		int a = Integer.parseInt(br.readLine());
		String k = br.readLine();
		int s =0;
		int t =0;
		int st = 0;
		for(int i=a-1; i>=0; i--) {
			char c = k.charAt(i);
			if(c=='s') s++;
			if(c=='t') t++;
			
			if(s !=0 && t!=0 && s==t) {
				st=i;
			}
		}
		bw.write(k.substring(st));
		bw.flush();
		bw.close();
	}
}
