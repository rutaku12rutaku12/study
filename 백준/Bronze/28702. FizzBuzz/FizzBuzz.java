import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();

		int next;
		
		if(A.matches("\\d+")){
			next = Integer.parseInt(A)+3; 
		}else if(B.matches("\\d+")) {
			next = Integer.parseInt(B)+2;
		}else { next = Integer.parseInt(C)+1;}
		
		if(next%3==0 && next%5==0) {
			bw.write("FizzBuzz");
		}else if(next%3==0 && next%5!=0) {
			bw.write("Fizz");
		}else if(next%3!=0 && next%5==0) {
			bw.write("Buzz");
		}else {bw.write(next+"");}
		
		bw.flush();
		bw.close();
	}
}