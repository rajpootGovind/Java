package nestedLoop_pattern;
import java.util.Scanner;
public class numerical_pattern2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
         int c = sc.nextInt();

         for(int i=1 ; i<=r ; i++){
             for(int j=1 ; j<=r ; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
}
