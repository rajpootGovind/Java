import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value");
        int x = sc.nextInt();
        if ( x<0) {
            x*=-1 ;
            System.out.println("the absolute value is "+x);
        } else {
            System.out.println("the absolute value is: "+x);
        }

    }
}
