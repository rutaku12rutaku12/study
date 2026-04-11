
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int str = 0;
        int max = 0;

        boolean fr = true;
        int cool =0;
        for(int i = 0; i<N; i++){
            int p = Integer.parseInt(st.nextToken());
            if(p>0){
                str++;
            }else {
                if(fr){
                    fr=false;
                    cool=2;
                }
                else{ // 프리져도 없을 때
                    str=0;
                }
            } cool--;
            if(cool<=0 && !fr){
                fr=true;
            }
            max=Math.max(max,str);
        } bw.write(max+"");
        bw.flush();
        bw.close();

    }
}