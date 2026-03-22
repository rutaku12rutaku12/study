import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (M == 0 && A == 0 && B == 0) break;

            // 시간 차이 (초) - 반올림
            double t = M * (1.0 / A - 1.0 / B);
            int totalSec = (int) Math.round(t * 3600);

            int h = totalSec / 3600;
            int m = (totalSec % 3600) / 60;
            int s = totalSec % 60;

            System.out.printf("%d:%02d:%02d\n", h, m, s);
        }
    }
}