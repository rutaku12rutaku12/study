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
		
		int N = Integer.parseInt(br.readLine());
		boolean [][] D = new boolean[100][100];
		int q=0;
		for(int i =0; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			int Aa = Integer.parseInt(A);
			String B = st.nextToken();
			int Bb = Integer.parseInt(B);
			for(int j=Aa; j<Aa+10; j++){
				for(int k=Bb; k<Bb+10; k++) {
					if(D[j][k]) {
						continue;
					}
					else {
						D[j][k]=true;
							q++;
					}
				}
			}
		}
		bw.write(q+"");
		bw.flush();
		bw.close();
	}
}