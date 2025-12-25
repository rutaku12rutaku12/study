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
		double sumcredit = 0;
		double sumgrade = 0;
		for(int i=0; i<20; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken().replace("A+", "4.5")
			.replace("A0", "4.0")
			.replace("B+", "3.5")
			.replace("B0", "3.0")
			.replace("C+", "2.5")
			.replace("C0", "2.0")
			.replace("D+", "1.5")
			.replace("D0", "1.0")
			.replace("F", "0.0");
			
			if(grade.equals("P")) {
				 // P이면 학점에서 제외
				continue;
			}
			double numgrade = Double.parseDouble(grade); // 평점을 숫자로
			sumcredit+=credit;
			sumgrade+=credit*numgrade;
		}
//		bw.write(sumgrade+" \n");
//		bw.write(sumcredit+" \n");
		bw.write(sumgrade/sumcredit+" \n");
		bw.flush();
		bw.close();
	}
}