import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String S = scan.nextLine();
            for (char c='a'; c<='z';c++) {
                System.out.print(S.indexOf(c) + " ");
            }

        scan.close();
    }
}