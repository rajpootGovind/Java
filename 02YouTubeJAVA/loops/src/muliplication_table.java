import java.util.Scanner ;
public class muliplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1 ; i<=10 ; i++){
            int z = i*a ;
            System.out.println(z);
        }
    }
}
