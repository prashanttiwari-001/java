import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.close();
        for(int i=1; i<=10; i++){
            int v = x*i;
            System.out.println(x + "*" + i + "=" + v);
            
        }
    }
}
