import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter percentage: ");
        int percentage = sc.nextInt();


        if (percentage > 90.0 ) {
            System.out.println("exellent");
        } else if (percentage > 80) {
            System.out.println("very good");
        } else if (percentage > 70) {
            System.out.println("good");
        } else if ( percentage> 60) {
            System.out.println("can do better");
        } else if (percentage >50 ) {
            System.out.println("average");
        }else if(percentage >40 ) {
            System.out.println("below average");
        }else if(percentage <40 && percentage>1) {
            System.out.println("fail");
        }else {
            System.out.println("invalid percentage");
        }
    }
}