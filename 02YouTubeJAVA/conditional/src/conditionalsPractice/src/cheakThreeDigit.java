import java.util.Scanner;
public class cheakThreeDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("enter number");
        int x = sc.nextInt();

     if ( x>99 && x<1000) {
         System.out.println("it is a three digit number");
     } else {
         System.out.println("not a three digit number");
     }
    }
}
