import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int N = Integer.parseInt(br.readLine());
			int [][] arr1 = new int[N][2];
			for(int i = 0 ; i < N; i ++) {
				String X = br.readLine();
					String[] parts = X.split(" ");
					int q = Integer.parseInt(parts[0]);
					int w = Integer.parseInt(parts[1]);
						arr1[i][0]=q;
						arr1[i][1]=w;
				}
			Arrays.sort(arr1, (a,b)->{
				if(a[0]!=b[0]) return a[0]-b[0];
				return a[1]-b[1];
			});
			for(int j = 0; j< N;j++) {
			bw.write(arr1[j][0]+" ");
			bw.write(arr1[j][1]+"\n");
			}
		bw.flush();
		bw.close();
	}
}