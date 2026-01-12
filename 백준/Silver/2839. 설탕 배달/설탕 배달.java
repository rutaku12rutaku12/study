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


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int c = 0;
		while(N>=0) {
			if(N%5==0) {
				c += N/5;
				bw.write(c+"");
				bw.flush();
				return;
			}
			N-=3;
			c++;
		}
		bw.write("-1");
		bw.flush();
		bw.close();
	}
} 