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
		int n=1;
		int k=1;
		int a =1;
		for(int i=A; i>1; i--) {
			n*=i;
			//bw.write(n+"");
		}
		for(int j=B; j>1; j--) {
			k*=j;
		}
		for(int x=A-B; x>1; x--) {
			a*=x;
		}
		bw.write(n/(k*a)+"");
		bw.flush();
		bw.close();
	}
}