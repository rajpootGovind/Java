import java.util.Scanner;
public class nnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("the numbers are: ");
        int n = sc.nextInt();
        int num = 1 ;
        while (num <= n ){
            System.out.println(num);
            num++ ;
        }
    }
}
