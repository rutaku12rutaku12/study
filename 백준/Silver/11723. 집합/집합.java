import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int bit = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                bit |= (1 << x);
            } 
            else if (command.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                bit &= ~(1 << x);
            } 
            else if (command.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if ((bit & (1 << x)) != 0) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } 
            else if (command.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                bit ^= (1 << x);
            } 
            else if (command.equals("all")) {
                bit = (1 << 21) - 2;
            } 
            else if (command.equals("empty")) {
                bit = 0;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
