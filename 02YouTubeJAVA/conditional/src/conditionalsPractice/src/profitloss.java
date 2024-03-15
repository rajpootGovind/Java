import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int sell = sc.nextInt();
        if (sell > cost) {
            System.out.println("profit");
         //   int profit = sc.nextInt();
          int  profit = sell - cost ;
            System.out.println("the profit is: "+profit);
        } else if (sell < cost){
            System.out.println("loss");
          //  int loss = sc.nextInt();
         int   loss = sell - cost ;
            System.out.println("the loss is "+loss);
        }else {
            System.out.println("zero profit");
        }
    }
}
