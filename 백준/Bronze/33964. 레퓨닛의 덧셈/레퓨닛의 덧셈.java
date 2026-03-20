import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i =0; i<K; i++){
            sum+=Math.pow(10,i);
        }
        for(int i =0; i<N; i++){
            sum+=Math.pow(10,i);
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}