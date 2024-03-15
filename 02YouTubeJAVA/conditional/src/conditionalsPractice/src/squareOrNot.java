import java.util.Scanner;
public class squareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("enter length: ");
    int length = sc.nextInt();
        System.out.println("the width");
        int width = sc.nextInt();

        if (length == width) {
            System.out.println("it is a Square");
        }else {
            System.out.println("not a sqaure");
        }
    }
}
