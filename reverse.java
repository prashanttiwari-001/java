import java.util.*;

public class reverse{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem = 0;
        while(n>0){
            rem = n%10;
            n= n/10;
            System.out.print(rem);
        }
        scn.close();
    }
}




