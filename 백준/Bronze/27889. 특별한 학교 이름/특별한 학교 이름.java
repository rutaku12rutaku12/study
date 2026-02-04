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

		String A = br.readLine();
		if(A.equals("NLCS")) {
			bw.write("North London Collegiate School");
		}
		if(A.equals("BHA")) {
			bw.write("Branksome Hall Asia");
		}
		if(A.equals("KIS")) {
			bw.write("Korea International School");
		}
		if(A.equals("SJA")) {
			bw.write("St. Johnsbury Academy");
		}
		bw.flush();
		bw.close();
	}
}