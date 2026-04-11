
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

        for(int i=0;i<3;i++){
            String a = br.readLine();
            int max=1;
            int count=1;
            for(int j=1;j<a.length();j++){
                if(a.charAt(j)==a.charAt(j-1)){
                    count++;
                }else{
                    count=1;
                }
                if(count>max){
                    max=count;
                }
            }bw.write(max+"\n");
        }

        bw.flush();
        bw.close();

    }
}