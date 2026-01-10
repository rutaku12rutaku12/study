import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String  A = (br.readLine());
		int C = Integer.parseInt(A);
		BigInteger B = new BigInteger(A);
		BigInteger sum = new BigInteger("1");
		
		for(int i = 1; i<= C; i++) {
			String q = i+"";
			BigInteger k = new BigInteger(q);
			sum = sum.multiply(k);
			
		}
		String Q = sum.toString();
		int zero = 0;
		for (int i = 0; i <Q.length()-1; i++) {
			char W = Q.charAt(Q.length()-i-1);
			if(W=='0') {
				zero++;
			}
			else break;
		}
		bw.write(zero+"");
		bw.flush();
		bw.close();
	}
} 