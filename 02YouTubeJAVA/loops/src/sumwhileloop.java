import java.util.Scanner;
public class sumwhileloop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("the sum of numbers");
        int n = sc.nextInt();
        int sum = 0 ;
        int num =1 ;
        while (num <= n){
            sum = sum+num ;
            num++ ;
        }
        System.out.println(sum);
    }
}
