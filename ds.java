import java.util.*;
  
  public class ds{
  
  public static void main(String[] args) {
      // print prime number between 2 numbers
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
    scn.close();
    for(int i=low; i<=high; i++){
        int count = 0;
        for(int div=2; div*div<=i; div++){
            if(i%div==0){
                count++;
                break;
            }
        }if(count==0){
            System.out.println(i);
            }
        }
    }
  }