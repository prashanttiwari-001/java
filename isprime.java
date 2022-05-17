import java.util.Scanner;

class isprime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            int t = scn.nextInt();
            int count = 0;
            for(int div=2; div*div<=t; div++){
                 if(t%div==0){
                     count++;
                    break;
                 }
            }if(count==0){
                System.out.println("Prime");
            }else{
                System.out.println(" Not Prime");
            }
            scn.close();
        }
    }
}