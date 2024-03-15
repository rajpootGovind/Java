import java.util.Scanner;
public class agegroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age: ");
        int age = sc.nextInt();


        if (age < 12) {
            System.out.println("child");
            if (age <= 5){
                System.out.println("toddler");
            }
        } else if (age > 12 && age < 18) {
            System.out.println("teenager");
        }else {
            System.out.println("adult");
        }


    }
}