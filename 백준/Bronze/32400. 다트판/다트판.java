import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[22];
        for(int i=1;i<21;i++){
            int k = Integer.parseInt(st.nextToken());
            arr[i]=k;
        }
        arr[0]=arr[20];
        arr[21]=arr[1];
        int index = 0;
        double al =0;
        double bo =0;
        for(int i=1;i<21;i++){
            if(arr[i]==20){
                index = i;
                al+=arr[index]+arr[index-1]+arr[index+1];
                break;
            }

        }
        al=al/3;
        for(int i=0;i<20;i++){
            bo+=arr[i];
        }
        bo=bo/20;
        if(al>bo)
        {
            bw.write("Alice");
        }
        if(bo>al) {
            bw.write("Bob");
        }
        if(al==bo){
            bw.write("Tie");
        }
        bw.flush();
        bw.close();
    }
}