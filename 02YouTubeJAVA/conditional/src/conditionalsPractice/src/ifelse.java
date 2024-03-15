import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int x = sc.nextInt();

        if (x % 5 == 0) {
            System.out.println("num is divisible");

        } else {
            System.out.println("the number is not divisible by ");
        }
    }
}
