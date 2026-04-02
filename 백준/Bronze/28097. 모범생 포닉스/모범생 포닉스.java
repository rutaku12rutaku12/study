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

        int N = Integer.parseInt(br.readLine());
        int s =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i =0; i<N;i ++) {

            int a = Integer.parseInt(st.nextToken());
            s+=a;
            if(st.hasMoreTokens()){
                s+=8;
            }
        }
        int day =0;
        while(s>=24){
            s-=24;
            day++;
        }
        bw.write(day+" "+s);
        bw.flush();
        bw.close();

    }
}
