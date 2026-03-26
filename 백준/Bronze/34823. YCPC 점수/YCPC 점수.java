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
        int y = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int sum = 0;
        boolean bool = true;
        while(bool){
            if(y<1 || c<2 || p<1){
                bool=false;
                bw.write(sum+"");
                bw.flush();
                bw.close();
                return;
            }
            if(y>=1&&c>=2 && p>=1){
                sum++;
                y--;
                c-=2;
                p--;
            }
        }


    }
}