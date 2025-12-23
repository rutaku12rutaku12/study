import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int i=0; i<N; i++) {
				String w = br.readLine();
				boolean[] used = new boolean[26];
				boolean isGroup =true;
				
				char prev = w.charAt(0);
				used[prev - 'a'] = true;
				
				for (int j =0; j<w.length(); j++) {
					char cur = w.charAt(j);
					
					if(cur != prev) {
						if (used[cur-'a']) {
							isGroup = false;
							break;
						}
						used[cur-'a'] = true;
						prev = cur;
					}
				}
				if (isGroup)count++;
			}
				bw.write(count+"");
		bw.flush();
		bw.close();
	}
}