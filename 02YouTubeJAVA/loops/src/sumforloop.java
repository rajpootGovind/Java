import java.util.Scanner;
public class sumforloop {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("the sum of number: ");
    int n = sc.nextInt();
   // int sum =0 ;
    for(int num = n ; num >= 0 ;  num--){
        System.out.println(num);
    }
       // System.out.println(sum);

}
}
