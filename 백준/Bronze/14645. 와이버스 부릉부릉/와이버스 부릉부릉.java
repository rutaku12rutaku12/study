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
		
		String A = (br.readLine());
		String B = (br.readLine());
		String C = (br.readLine());
		String D = (br.readLine());
		
		bw.write("비와이");
		bw.flush();
		bw.close();
	}
}