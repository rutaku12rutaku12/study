import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        if (A.equals(" ")){
            System.out.print(0);
        }
        else if (A.substring(0,1).equals(" ")){
            System.out.print(A.split(" ").length-1);
        }
        else {
            A.split(" ");
            System.out.print(A.split(" ").length);
        }
        scan.close();
    }
}