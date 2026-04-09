import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            // 짝수 줄이면 앞에 공백 1칸
            if (i % 2 == 0) {
                bw.write(" ");
            }

            // 별 N개 출력
            for (int j = 0; j < N; j++) {
                bw.write("* ");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}