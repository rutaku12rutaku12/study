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

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T;i++) {
			String a = (br.readLine());
			if(a.equals("Algorithm")) {
				bw.write(204+"\n");
			}
			else if(a.equals("DataAnalysis")) {
				bw.write(207+"\n");
			}
			else if(a.equals("ArtificialIntelligence")) {
				bw.write(302+"\n");
			}
			else if(a.equals("CyberSecurity")) {
				bw.write("B101\n");
			}
			else if(a.equals("Network")) {
				bw.write(303+"\n");
			}
			else if(a.equals("Startup")) {
				bw.write(501+"\n");
			}
			else if(a.equals("TestStrategy")) {
				bw.write(105+"\n");
			}
			
		}
		bw.flush();
		bw.close();
	}
}