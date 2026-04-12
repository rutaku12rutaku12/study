
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum =0;
        List <Integer> Harr = new ArrayList<>();
        List <Integer> Earr = new ArrayList<>();
        for(int i=0; i<N;i++){
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int easy = Integer.parseInt(stt.nextToken());
            int hard = Integer.parseInt(stt.nextToken());
            if(L-hard>=0){
                Harr.add(hard);
            }
            else if(L-easy>=0){
                Earr.add(easy);
            }
        }
        for(int i=0; i<Harr.size();i++){
            if(K==0){
                break;
            }
            if(Harr.get(i)>0){
                sum+=140;
                K--;
            }
        }
        for(int i=0; i<Earr.size();i++){
            if(K==0){
                break;
            }
            if(Earr.get(i)>0){
                sum+=100;
                K--;
            }
        }
        bw.write(sum+"\n");
        //bw.write(Harr+"\n"+Earr+"\n");
        //bw.write(Harr.size()*140+Earr.size()*100+"");
        bw.flush();
        bw.close();

    }
}