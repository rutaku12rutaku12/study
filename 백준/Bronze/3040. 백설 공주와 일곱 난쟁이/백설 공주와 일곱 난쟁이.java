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

        int [] arr = new int[9];
        for(int i=0; i<9;i++) {
            int T = Integer.parseInt(br.readLine());
            arr[i]=T;
        }
        int sum =0;
        for(int i=0; i<9;i++){
            sum+=arr[i];
        }
        int x =0;
        int y =0;
        for(int i=0;i <9;i++){
            for(int j=0; j<9;j++){
                if(sum-(arr[i]+arr[j])==100){
                   x=i;
                   y=j;
                }
            }
        }
        for(int i=0; i<9;i++){
            if(i==x || i==y){
                continue;
            }
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();

    }
}