package primeb;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no of rows :");
        int n = scn.nextInt();
        scn.close();
        for(int i = 1; i<=n; i++){
           // System.out.println("Hello world");
           for(int j = 1; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}
