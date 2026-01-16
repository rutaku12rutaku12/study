import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		StringTokenizer st = new StringTokenizer(N);
		BigInteger A = new BigInteger(st.nextToken());
      
        BigInteger B = new BigInteger(st.nextToken());
        
		bw.write(A.add(B)+"");
		bw.flush();
		bw.close();
	}
}