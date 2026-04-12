
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.reflect.Array.set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List <Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N;i++) {
            int a = Integer.parseInt(st.nextToken());
            set.add(a);
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        Collections.sort(list);
        for(int i=0; i<list.size();i++){
            bw.write(list.get(i)+" ");
        }
        //bw.write(list+"");
        //bw.write(set+"");
        bw.flush();
        bw.close();

    }
}
