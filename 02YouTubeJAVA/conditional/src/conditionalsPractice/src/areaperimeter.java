import java.util.Scanner;
public class areaperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
int a = length * width ;
        System.out.println(a);
int p = (length+width)*2 ;
        System.out.println(p);
        if (a > p ){
            System.out.println("area of rectangle is greater than perimeter");
        } else {
            System.out.println("less than primeter");
        }
    }
}
