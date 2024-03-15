import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("the numbers are: ");
        int n = sc.nextInt();
        int num =n + 1 ;

        do {
            System.out.println(num);
            num++ ;
        }while (num <= (n+ 5));

    }
}
