import java.util.Scanner;
public class simpleinterest {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal");
        float p = sc.nextFloat();
        System.out.println("enter rate");
        float r = sc.nextFloat();
        System.out.println("enter time");
        float t = sc.nextFloat();
      float si = p*r*t/100;
        System.out.println("the pricipal value is "+p);
        System.out.println("the rate value is "+r);
        System.out.println("the time value is "+t);
        System.out.println("the simple interest is: "+si);

    }
}
