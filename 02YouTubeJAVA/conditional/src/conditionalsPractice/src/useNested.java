import java.util.Scanner;
public class useNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if ((x % 5 == 0 ||  x % 3 == 0) && ( x % 15 != 0)) {
            System.out.println("yess");

//            if (x % 15 != 0) {
//                System.out.println("true number");
//            } else {
//                System.out.println("false number");
//            }

        }else {
            System.out.println("try again");
        }
    }

}