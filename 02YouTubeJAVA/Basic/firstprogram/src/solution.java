import java.util.Scanner;
public class solution {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch = sc.next().charAt(0);

     if (Character.isUpperCase(ch)) {
        System.out.println("1");
        }else if (Character.isLowerCase(ch)) {
           System.out.println("0");
       }else{
           System.out.println("-1");
       }
    }
}

