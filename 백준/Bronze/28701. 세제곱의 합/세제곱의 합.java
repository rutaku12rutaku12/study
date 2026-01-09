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
		
		int A = Integer.parseInt(br.readLine());
		int sum1 = 0;
		for(int i = 1 ; i<A+1;i++) {
			sum1+=i;
		}
		int sum2 = (int) Math.pow(sum1, 2);
		bw.write(sum1+"\n"+sum2+"\n"+sum2+"\n");
		bw.flush();
		bw.close();
	}
}