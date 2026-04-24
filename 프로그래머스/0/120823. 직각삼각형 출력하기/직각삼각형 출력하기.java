import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        for(int i=1; i<=n;i++){
            for(int j=0; j<i; j++){
            a+="*";
            }
            a+="\n";
        }
        System.out.println(a);
    }
}