import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for( int i=0; i<N; i++){
            String A = scan.next();
            System.out.print(A.charAt(0));
            System.out.println(A.charAt(A.length()-1));
        }
        scan.close();
    }
}