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
		int ys = 0;
		int ko = 0;
		for(int i=0; i<a;i++) {
			String A = br.readLine();
			if(A.equals("yonsei")) {
				ys=i;
			}
			if(A.equals("korea")) {
				ko=i;
			}
		}
		if(ys<ko) {
			bw.write("Yonsei Won!");
		} else {bw.write("Yonsei Lost...");}
		bw.flush();
		bw.close();
	}
}
