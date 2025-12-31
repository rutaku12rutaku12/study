import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int a = Integer.parseInt(br.readLine());
			int q=0;
			int d=0;
			int n=0;
			int p=0;
			while(a>=25) {
				q++;
				a-=25;
			}
			while(a>=10) {
				d++;
				a-=10;
			}
			while(a>=5) {
				n++;
				a-=5;
			}
			while(a>=1) {
				p++;
				a-=1;
			}
			bw.write(q+" "+d+" "+n+" "+p+"\n");
		}
		bw.flush();
		bw.close();
	}
}