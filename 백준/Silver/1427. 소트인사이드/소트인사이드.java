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
			String K = T+"";
			int [] b = new int[K.length()];
			for(int i = 0 ; i < K.length(); i ++) {
				b[i] = K.charAt(i)-'0';
			}
				Arrays.sort(b);
				for(int i = 0 ; i < K.length(); i ++) {
					bw.write(b[K.length()-i-1]+ "");
				}
		bw.close();
	}
}