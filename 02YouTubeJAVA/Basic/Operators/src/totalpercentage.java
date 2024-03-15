import java.util.Scanner;
public class totalpercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //System.out.println("physics marks");
        double p = sc.nextDouble();
        //System.out.println("chemistry marks");
        double c = sc.nextDouble();
       // System.out.println("math marks");
        double m = sc.nextDouble();
       // System.out.println("art marks");
        double a = sc.nextDouble();
       // System.out.println("social science marks");
        double s = sc.nextDouble();

        double total_percentage = (p+c+m+a+s)/5 ;
        System.out.println(total_percentage);

    }
}
