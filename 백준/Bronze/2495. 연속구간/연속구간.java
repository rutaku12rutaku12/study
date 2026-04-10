import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t = 0; t < 3; t++) {
            String s = br.readLine();

            int max = 1;
            int count = 1;

            for(int i = 1; i < s.length(); i++) {
                if(s.charAt(i) == s.charAt(i-1)) {
                    count++;
                } else {
                    count = 1;
                }

                if(count > max) {
                    max = count;
                }
            }

            System.out.println(max);
        }
    }
}