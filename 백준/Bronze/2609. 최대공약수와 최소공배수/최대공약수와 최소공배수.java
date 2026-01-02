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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int a =A;
		int b =B;
		int i=1;
		int j=1;
		int K=0;
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		bw.write(a+"\n");
		while(true) {
			if(A*i==B*j) {
				K=A*i;
				break;
			}
			if(A*i>B*j) {
				j++;
			}else {i++;}
			
		}
		bw.write(K+"");
		bw.flush();
		bw.close();
	}
}