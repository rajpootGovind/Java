import java.util.Scanner;

class alzebra {
  int add(int a, int b) {
    int ans = a + b;
    return ans;
  }
}

public class sum {
  public static void main(String[] args) {

    alzebra object = new alzebra();
    try (Scanner sc = new Scanner(System.in)) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println("sum of number is: ");
      int z = object.add(x, y);
      System.out.println(z);
    }

  }
}
