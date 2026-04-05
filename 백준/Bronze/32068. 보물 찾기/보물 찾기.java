import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int p = S; // 위치
            int set =1; //
            int n = 0; //
            int k = -1;
            while(true){
               // bw.write(n+1+"단계 ");
               // bw.write("위치:"+p+" ");
                if(L==p){
                   // bw.write("위치:"+p+" ");
                    bw.write(set+"\n");
                    bw.flush();
                    break;
                }
                else if(R==p){
                   // bw.write("위치:"+p+" ");
                    bw.write(set+"\n");
                    bw.flush();
                    break;
                }
                set++;
                n++;
                k*=-1;
                p+=n*k;
                //bw.write("위치:"+p+"\n ");
            }

        }
        bw.flush();
        bw.close();

    }
}