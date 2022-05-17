import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = n-1;
        int st = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=st; j++){
                System.out.print("* ");
            }
            if(i<= n){
                sp--;
            }
            System.out.println();
        }
    }
}
