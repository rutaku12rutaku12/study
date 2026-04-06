
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
        int [][] arr = new int[T][3];
        for(int i =0; i<T;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[i][0]=a;
            arr[i][1]=b;
            arr[i][2]=c;
        }
       // bw.write(Arrays.deepToString(arr)+"\n");
        boolean [][] bool = new boolean[T][3];
        for(int i =0; i<T;i++){
            for(int j=0; j<3; j++){
                for(int k=1; k<T-i;k++) {
                  //  bw.write(arr[i][j]+" : "+arr[i+k][j]+"\n");
                    if (arr[i][j] == arr[i + k][j]){
                        bool[i][j] = true;
                        bool[i+k][j]=true;
                    }
                }
            }
        }
       // bw.write(Arrays.deepToString(bool)+"\n");
        for(int i=0; i<T;i++){
            int sum =0;
            for(int j=0; j<3;j ++){
                if(!bool[i][j]){
                    sum+=arr[i][j];
                }
            }bw.write(sum+"\n");
        }

        bw.flush();
        bw.close();

    }
}