import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int [] arr = new int[A];
		
			String B = (br.readLine());
			StringTokenizer st = new StringTokenizer(B);
			
			for(int i =0; i<A;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int 국어 = arr[0];
			int 수학 = 0;
			int 영어 = 0;
			int 탐구 = 0;
			int 제2외국어 = -1;
			if(A==2) {
				수학 = arr[1];
			}
			if(A==3) {
				수학 = arr[1];
				영어 = arr[2];
			}
			if(A==4) {
				수학 = arr[1];
				영어 = arr[2];
				탐구 = arr[3];
			}
			if(A==5) {
				수학 = arr[1];
				영어 = arr[2];
				탐구 = arr[3];
				제2외국어 = arr[4];
			}
			
			int result = 0;
			
			if(국어>영어) {
				result = (국어-영어)*508;
			}else {result = (영어-국어)*108;}
			if(수학>탐구) {
				result += (수학-탐구)*212;
			}else {result += (탐구-수학)*305;}
			if(제2외국어>=0) {
				result+=제2외국어*707;
			}
			result*=4763;
			bw.write(result+"");
		bw.flush();
		bw.close();
	}
}