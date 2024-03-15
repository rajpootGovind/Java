import java.util.Scanner;
public class reverse_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for (int i = 10 ; i > 0 ; i--){
             int z = a*i ;
            System.out.println(z);
        }
    }
}
