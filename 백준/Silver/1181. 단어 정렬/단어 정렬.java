import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String [] arr = new String[N];
		for(int i = 0 ; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr);
		for(int i = 0 ; i<N-1; i++) {
			for(int j = 0; j<N-1-i; j++) {
				if(arr[j].length() > arr[j+1].length()) {
					String b = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = b;
				}
			}
		}
		bw.write(arr[0]+"\n");
		for(int i = 1 ; i<N; i++) {
			if(arr[i-1].equals(arr[i])) {
				continue;
			} else {bw.write(arr[i]+"\n");}
		}
		bw.flush();
		bw.close();
	}
}