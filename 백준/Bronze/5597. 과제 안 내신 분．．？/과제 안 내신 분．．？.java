import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean[] check = new boolean[31];
        for(int i = 1; i<29; i++){
            int j = scan.nextInt();
            check[j] = true;
        }
        for(int i = 1; i<31; i++){
            if(check[i]==false) {
                System.out.println(i);
            }
        }
        scan.close();
    } // m end
} // c end