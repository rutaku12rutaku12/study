import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int k = scan.nextInt()-1;
        System.out.println(S.charAt(k));
        scan.close();
    }
}