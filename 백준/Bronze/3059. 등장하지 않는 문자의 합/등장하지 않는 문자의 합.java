import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String S = br.readLine();
            
            boolean[] check = new boolean[26]; // A~Z
            
            // 등장한 문자 체크
            for (char c : S.toCharArray()) {
                check[c - 'A'] = true;
            }
            
            int sum = 0;
            
            // 등장하지 않은 문자 합
            for (int i = 0; i < 26; i++) {
                if (!check[i]) {
                    sum += (i + 'A');
                }
            }
            
            System.out.println(sum);
        }
    }
}