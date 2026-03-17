import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] minus = input.split("-");
        int result =0;
        String[] first= minus[0].split("\\+");
        for(String s : first){
            result += Integer.parseInt(s);
        }
        for(int i =1; i< minus.length;i++){
            String[] plus = minus[i].split("\\+");
            int sum =0;

            for(String s :plus){
                sum+=Integer.parseInt(s);
            }
            result-=sum;
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
