import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int K = Integer.parseInt(st.nextToken());
//        int N = Integer.parseInt(st.nextToken());
//        int [] arr = new int[K];
//        int av = 0;
//        for(int i =0;i <K;i++){
//            int r = Integer.parseInt(br.readLine());
//            arr[i]=r;
//            av+=r;
//        }
//        av= av/N;
//        int set = 0;
//        for(int i=0; i<K;i++){
//            while(arr[i]-av>0){
//                if(set==N){
//                    bw.write(av+"");
//                    bw.flush();
//                    return;
//                }else{
//                    av--;
//                }
//
//                arr[i]-=av;
//                set++;
//            }
//
//        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int h = W/L;
        int w = H/L;
        int k = h*w;
        bw.write(Math.min(N,k)+"");
        bw.flush();
        bw.close();
    }
}


















