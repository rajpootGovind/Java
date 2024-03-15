import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int z = 1 ;
        for (int i = a ; i>0 ; i--){
             z *= i;}
            System.out.println(z);

    }
}
