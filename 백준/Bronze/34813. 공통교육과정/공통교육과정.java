import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String a = (br.readLine());
			if(a.contains("F")) {
				bw.write("Foundation\n");
			}
			else if(a.contains("C")) {
				bw.write("Claves\n");
			}
			else if(a.contains("V")) {
				bw.write("Veritas\n");
			}
			else if(a.contains("E")) {
				bw.write("Exploration\n");
			}
		bw.flush();
		bw.close();
	}
}