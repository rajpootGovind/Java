import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if (( x % 5 ==0) && (x % 3 != 0)) {
            System.out.println("true number");
        } else {
            System.out.println("false number");
        }
    }
}
