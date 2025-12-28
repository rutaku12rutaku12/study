import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String 결과 = "";
		while(N>0) {
			int 나머지 = N%B;
			if(나머지>9) {
				char 값 = (char)(나머지+'A'-10);
				결과+= 값;
			}
			else{
				char 값 = (char)(나머지+'0');
				결과+=값;
			}
			N/=B;
		}
		StringBuffer sb = new StringBuffer(결과);
		bw.write(sb.reverse().toString());
		bw.flush();
		bw.close();
	}
}