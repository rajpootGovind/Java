package nestedLoop_pattern;
import java.util.Scanner;
public class numerical_prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1 ; i <= r ; i++) {
           for ( int j = 1 ; j <= (r-i) ; j++ ){    // r-1 spaces
               System.out.print(" ");
           }
               for ( int k = 1 ; k <= i ; k++) {    // 1 to i numbers
                   System.out.print(k);
               }
                   for (int l = i - 1; l >= 1; l--) { // i-1 to 1 number
                       System.out.print(l);
           }
            System.out.println();
        }
    }
}
