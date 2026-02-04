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
			
		String A = "WelcomeToSMUPC";
		int N = Integer.parseInt(br.readLine());
		int k=(N-1)%14;
		if(N<15) {
			bw.write(A.charAt(N-1));
		} else {bw.write(A.charAt(k));}
		bw.flush();
		bw.close();
	}
}