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
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
        StringTokenizer stt = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(stt.nextToken());
        }
        int z = 1;
        for(int i=N ;i >=2; i--){
            for(int j = 0; j<i-1; j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    if(z==K){
                        for(int a = 0; a<N;a++)
                        bw.write(arr[a]+" ");
                        bw.flush();
                        return;
                    }
                    z++;
                }
            }
        }
        bw.write("-1");
        bw.flush();
        bw.close();
    }
}
