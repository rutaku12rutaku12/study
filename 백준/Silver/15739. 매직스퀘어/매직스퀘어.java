import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][n];
        boolean[] visited = new boolean[n*n+1];

        for(int i =0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n;j++){
                int a = Integer.parseInt(st.nextToken());

                if(a<1 || a>n*n){
                    bw.write("FALSE");
                    bw.flush();
                    return;
                }
                if(visited[a]){
                    bw.write("FALSE");
                    bw.flush();
                    return;
                }
                visited[a]= true;
                arr[i][j]=a;
            }
        }
        int magic = n*(n*n+1)/2;

        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
            if(sum != magic){
                bw.write("FALSE");
                bw.flush();
                return;
            }
        }
        for(int j=0;j<n;j++) {
            int sum =0;
            for(int i=0; i<n;i++){
                sum+= arr[j][i];
            }
            if(sum != magic){
                bw.write("FALSE");
                bw.flush();
                return;
            }
        }
        int d = 0;
        int dd = 0;
        for(int i=0;i <n;i++){
            d += arr[i][i];
            dd += arr[i][n-1-i];
        }
        if(d!=magic || dd!=magic){
            bw.write("FALSE");
            bw.flush();
            return;
        }
        bw.write("TRUE");
        bw.flush();
        bw.close();
    }
}
