
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T;i++){
            if(i%2==1){
                bw.write(" ");
            }
            bw.write("*");
            for(int j=1; j<T;j++){
                bw.write(" *");
            }bw.write("\n");

        }
        bw.flush();
        bw.close();

    }
}