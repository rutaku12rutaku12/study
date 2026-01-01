
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
		String Na = (br.readLine());
		StringTokenizer st = new StringTokenizer(Na);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] card = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st2.nextToken());
        }

        int best = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= M && sum > best) {
                        best = sum;
                    }
                }
            }
        }bw.write(best+" ");
		bw.flush();
		bw.close();
	}
}