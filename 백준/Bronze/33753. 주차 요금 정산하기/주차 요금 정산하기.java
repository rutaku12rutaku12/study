
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
            int a = Integer.parseInt(st.nextToken()); // 기본요금 30분까지
            double b = Integer.parseInt(st.nextToken()); // 초과 분
            int c = Integer.parseInt(st.nextToken()); // 초과분 당 요금
        double t = Integer.parseInt(br.readLine());
        if(t<=30){
            bw.write(a+"");
        }else {
            double sum = a + Math.ceil((t - 30) / b) * c;
            int summ = (int) sum;
            bw.write(summ + "");
        }
        bw.flush();
        bw.close();

    }
}