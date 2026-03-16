import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()); // 가위바위보 횟수
        String a = br.readLine(); // 내가 낸 가위바위보
        char [] arr = new char[A];
        for(int i =0;i<A;i++) {
            arr[i] = a.charAt(i);
        }
        int N = Integer.parseInt(br.readLine()); // 친구 명수
        int score = 0;
        int max =0;
        String[] fra = new String[N];
        for(int i=0; i<N;i++){
            fra[i]= br.readLine();
        }
        for(int i=0;i<A;i++){
            int P = 0;
            int S =0;
            int R =0;
            for(int k=0; k<N;k++){
                char me = arr[i];

                    char fr = fra[k].charAt(i);
                   // bw.write(me+" "+fr+"///");

                    if(me==fr){
                        score++;
                    }
                    else if ((me=='P' && fr=='R')|| (me=='R'&& fr=='S')|| (me=='S'&&fr=='P')){
                        score+=2;

                    }
                    if(fr=='R'){
                        R++;
                        P+=2;
                    }
                    else if(fr=='P'){
                        P++;
                        S+=2;
                    }else {
                        S++;
                        R+=2;
                    }
                    //bw.write(P+" "+S+" "+R+"\n");

            }max +=Math.max(P,Math.max(S,R));

        }
        bw.write(score+"\n");
        bw.write(max+"");
        bw.flush();
        bw.close();
    }
}
