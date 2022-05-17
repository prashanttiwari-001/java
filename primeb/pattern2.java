

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int n = scn.nextInt();
        scn.close();
        for(int i = 1; i<= n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
