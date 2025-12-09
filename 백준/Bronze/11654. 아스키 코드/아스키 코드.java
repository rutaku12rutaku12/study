import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            char A = scan.next().charAt(0);
            byte num = (byte)A; 
            System.out.print(num);

        scan.close();
    }
}