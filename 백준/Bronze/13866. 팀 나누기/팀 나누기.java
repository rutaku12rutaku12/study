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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
       
        int a = Math.abs((A+B)-(C+D));
        int b = Math.abs((A+C)-(B+D));
        int c = Math.abs((A+D)-(B+C));
        
        int re = Math.min(a,Math.min(b,c));
        
        bw.write(re+"");

        bw.flush();
        bw.close();
    }
}