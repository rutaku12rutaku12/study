import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int bestA = 1, bestB = 1, bestC = n;
        int minSurface = Integer.MAX_VALUE;

        for (int a = 1; a * a * a <= n; a++) {
            if (n % a != 0) continue;

            for (int b = a; a * b * b <= n; b++) {
                if ((n / a) % b != 0) continue;

                int c = n / (a * b);

                int surface = 2 * (a*b + b*c + c*a);

                if (surface < minSurface) {
                    minSurface = surface;
                    bestA = a;
                    bestB = b;
                    bestC = c;
                }
            }
        }

        System.out.println(bestA + " " + bestB + " " + bestC);
    }
}