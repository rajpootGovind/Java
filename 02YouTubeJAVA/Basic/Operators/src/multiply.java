import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int multiply= num1*num2;
        System.out.println("the multiply of number is "+ multiply);

    }
}