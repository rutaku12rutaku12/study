import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			int B = 1;
			String A = br.readLine();
				
			for(int i = 0 ; i <A.length();i++) {
				B+=1;
				if(A.charAt(i)=='0') {
					B+=4;
				}
				else if(A.charAt(i)=='1') {
					B+=2;
				}
				else {
					B+=3;
				}
				
			}
			if(A.equals("0")) {
				break;
			}
			bw.write(B+"\n");
		}
		bw.flush();
		bw.close();
	}
} 