import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. 숫자 2개 입력받기
        String Q = scan.next();
        String W = scan.next();
        // 2. 두 수를 뒤집기

        String a = (""+Q.charAt(2)+Q.charAt(1)+Q.charAt(0));
        String b = (""+W.charAt(2)+W.charAt(1)+W.charAt(0));
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        if(A>B){
        System.out.print(A);}
        else System.out.print(B);
        // 3. 뒤집은 수를 비교하고 큰 수 출력
        scan.close();
    }
}