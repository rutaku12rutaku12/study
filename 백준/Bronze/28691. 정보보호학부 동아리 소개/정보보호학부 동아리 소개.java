import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		if(A.equals("M")) {
			bw.write("MatKor");
		}if(A.equals("W")) {
			bw.write("WiCys");
		}if(A.equals("C")) {
			bw.write("CyKor");
		}if(A.equals("A")) {
			bw.write("AlKor");
		}if(A.equals("$")) {
			bw.write("$clear");
		}
		bw.flush();
		bw.close();
	}
}