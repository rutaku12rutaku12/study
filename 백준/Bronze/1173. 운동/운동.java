import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        // 운동 자체가 불가능한 경우
        if (m + T > M) {
            System.out.println(-1);
            return;
        }

        int cur = m;
        int exercise = 0;
        int time = 0;

        while (exercise < N) {
            if (cur + T <= M) {
                cur += T;
                exercise++;
            } else {
                cur -= R;
                if (cur < m) cur = m;
            }
            time++;
        }

        System.out.println(time);
    }
}