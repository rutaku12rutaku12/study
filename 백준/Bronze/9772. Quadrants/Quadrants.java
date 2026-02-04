
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
			
		while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine());
			double x =Double.parseDouble(st.nextToken());
			double y =Double.parseDouble(st.nextToken());
			if(x==0&&y==0) {
				bw.write("AXIS\n");
				break;
			}
			if(x>0 && y>0) {
				bw.write("Q1\n");
			}
			else if (x>0 && y<0) {
				bw.write("Q4\n");
			}
			else if (x<0 && y>0) {
				bw.write("Q2\n");
			}
			else if (x<0 && y<0) {
				bw.write("Q3\n");
			}
			else {bw.write("AXIS\n");}
		}
		bw.flush();
		bw.close();
	}
}