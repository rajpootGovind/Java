import java.util.Scanner;
public class sum_of_nEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
int sum = 0 ;
        while (num <= n) {
            if (num%2 == 0) {
              //  continue;
                sum += num ;
               System.out.println(num);
            }
num++ ;}
           System.out.println(sum);

    }
}
