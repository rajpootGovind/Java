import java.util.Scanner;
public class ageternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number");
        int num = sc.nextInt();
        String ans = (num%2==0)?" number is even": "number is odd";
        System.out.println(ans);
    }


}
