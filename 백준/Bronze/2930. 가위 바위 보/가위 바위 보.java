import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        String s= br.readLine();
        int N  = Integer.parseInt(br.readLine());

        String[] f = new String[N];
        for(int i=0; i<N;i++){
            f[i]=br.readLine();
        }
        int score=0;
        int max=0;

        for(int i=0;i<R;i++){
            int S=0;
            int P=0;
            int Rr=0;
            char me =s.charAt(i);

            for(int j=0; j<N;j++){
                
                char fr = f[j].charAt(i);

                if(me==fr) {
                    score++;
                }else if((me=='S'&&fr=='P')||(me=='P'&&fr=='R')||(me=='R'&&fr=='S')){
                    score+=2;
                }
                 if(fr=='S'){
                    S+=1;
                    Rr+=2;
                }
                else if(fr=='P'){
                    P+=1;
                    S+=2;
                }
                else{
                    Rr+=1;
                    P+=2;
                }
            }
            max+=Math.max(S,Math.max(P,Rr));
        }
        bw.write(score+"\n");
        bw.write(max+"");
        bw.flush();
        bw.close();
    }
}
