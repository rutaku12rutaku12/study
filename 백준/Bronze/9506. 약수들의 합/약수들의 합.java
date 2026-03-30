import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            List<Integer> di = new ArrayList<>();
            di.add(1);

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    di.add(i);

                    if (i != n / i) {
                        di.add(n / i);
                    }
                }
            }

            Collections.sort(di);

            int sum = 0;
            for (int d : di) {
                sum += d;
            }

            if (sum == n) {
                bw.write(n + " = ");
                for (int i = 0; i < di.size(); i++) {
                    bw.write(di.get(i) + "");
                    if (i != di.size() - 1) {
                        bw.write(" + ");
                    }
                }
                bw.newLine();
            } else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}