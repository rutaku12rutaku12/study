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
			int T = Integer.parseInt(br.readLine());
			int [] b = new int[T];
			for(int i = 0 ; i < T ; i ++) {
				int k = Integer.parseInt(br.readLine());
				b[i] = k;
			}
				Arrays.sort(b);
				for(int i = 0 ; i < T ; i ++) {
					bw.write(b[i]+ "\n");
				}
		bw.close();
	}
}