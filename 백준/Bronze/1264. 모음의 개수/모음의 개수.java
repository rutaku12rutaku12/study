
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while( true ) {
			String x = br.readLine();
			if(x.equals("#"))break;
			int k= 0;
			for(int i =0; i<x.length()-1;i++) {
				if(x.charAt(i)=='A'){
					k++;
				}
				if(x.charAt(i)=='E'){
					k++;
				}
				if(x.charAt(i)=='I'){
					k++;
				}
				if(x.charAt(i)=='O'){
					k++;
				}
				if(x.charAt(i)=='U'){
					k++;
				}
				if(x.charAt(i)=='a'){
					k++;
				}
				if(x.charAt(i)=='e'){
					k++;
				}
				if(x.charAt(i)=='i'){
					k++;
				}
				if(x.charAt(i)=='o'){
					k++;
				}
				if(x.charAt(i)=='u'){
					k++;
				}
			}			bw.write(k+"\n");
		}
		bw.flush();
		bw.close();
	}
}