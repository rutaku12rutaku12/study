import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0&&b==0&&c==0){
                bw.flush();
                bw.flush();
                bw.close();
                return;
            }
            double t = a*(1.0/b-1.0/c);
            int k = (int)Math.round(t*3600);
            int h = k/3600;
            int m = k%3600/60;
            int s = k%60;
            bw.write(String.format("%d:%02d:%02d\n",h,m,s));

        }

    }
}