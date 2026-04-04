
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


        StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
        // 1분마다 선택 : 휴식 or 운동
        // 운동 => 맥박(T) 상승
        // 맥박 최대치 M
        // 휴식 => 맥박(R) 감소
        // 맥박 최소치 m
        int re = m;
        int time = 0;
        int set = 0;

        while(re>=m && re<=M) {
            if(m+T>M){
                bw.write("-1");
                bw.flush();
                return;
            }
            if(set==N){
                bw.write(time+"");
                bw.flush();
                return;
            }
            if(re+T<=M){
                re+=T;
                time++;
                set++;
               // bw.write("운동 \n");
            }
            else if(re+T>M){
                if(re-R<=m){
                    re=m;
                }else {
                    re -= R;
                }
                time++;
              //  bw.write("휴식 \n");
            }
            else{
                bw.write("-1");
                bw.flush();
                return;
            }
        }
        bw.flush();
        bw.close();

    }
}