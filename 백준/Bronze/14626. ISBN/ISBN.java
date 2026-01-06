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
		
		int sum =0;
		int bro = -1;
		
		for( int i = 0; i <13; i++) {
			char c= A.charAt(i);
			if( c== '*') {
				bro = i;
				continue;
			}
			int num = c-'0';
			sum+=(i%2==0)? num: num*3;
		}
		int weight = (bro%2==0)?1:3;
		for(int x= 0; x<=9; x++) {
			if((sum+x*weight)%10==0) {
				bw.write(x+"");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}