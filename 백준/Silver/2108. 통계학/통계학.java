import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] count = new int[8001]; // -4000 ~ 4000
        int sum = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;

            sum += num;
            count[num + 4000]++;

            if(num > max) max = num;
            if(num < min) min = num;
        }

        Arrays.sort(arr);

        // 1. 산술평균
        bw.write(Math.round((double)sum / n) + "\n");

        // 2. 중앙값
        bw.write(arr[n / 2] + "\n");

        // 3. 최빈값
        int modeMax = 0;
        for(int i = 0; i < 8001; i++) {
            if(count[i] > modeMax) {
                modeMax = count[i];
            }
        }

        boolean second = false;
        int mode = 0;

        for(int i = 0; i < 8001; i++) {
            if(count[i] == modeMax) {
                mode = i - 4000;
                if(second) break;
                second = true;
            }
        }

        bw.write(mode + "\n");

        // 4. 범위
        bw.write((max - min) + "\n");

        bw.flush();
        bw.close();
    }
}