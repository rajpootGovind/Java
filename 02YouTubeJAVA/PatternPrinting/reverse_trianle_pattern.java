import java.util.Scanner;
public class reverse_trianle_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 0 ; i<=r ; i++){
            for (int j = 0 ; j < (r-i); j++){
                System.out.print("*");
        }
            System.out.println();
        }
    }
}
