import java.util.Scanner;
public class find_remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();

        int remainder = a % b ;
        System.out.print("the remainder is: "+remainder);
    }
}
