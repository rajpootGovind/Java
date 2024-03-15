import java.util.Scanner;
//class math {    -> no need of class for reseeved methods or library
//int add (int a , int b ){
//     int ans = a + b ;
//     return ans ;
//   }

//}
public class reserved_library {
  public static void main(String[] args) {
    try (// math object = new math ();
        Scanner sc = new Scanner(System.in)) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      // System.out.print("the sum of number is : ");
      // int z= object.add(x,y);
      // System.out.println(z);
      System.out.println(Math.floor(5.7));
      System.out.println(Math.ceil(5.4));

      System.out.println(Math.pow(x, y));
    }
    System.out.println(Math.sqrt(36));

  }
}
