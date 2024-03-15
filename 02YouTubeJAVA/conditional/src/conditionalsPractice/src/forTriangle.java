import java.util.Scanner;
public class forTriangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int x = a+b ;
//      //  System.out.println(x);
//        int y = b+c ;
//     //   System.out.println(y);
//        int z = c+a ;
//     //   System.out.println(z);
//
//       if (( x > c) && (y > a)  && (z > b)) {
        if ((a+b > c) && (b+c > a ) && (c+a > b)) {
           System.out.println("it is a triangle");
       } else {
           System.out.println("not a triangle");
       }
    }
}
