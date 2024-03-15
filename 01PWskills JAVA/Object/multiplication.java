import java.util.Scanner;

class multi {
    int multi1(int a, int b) {
        int ans = a * b;
        return ans;
    }
}

public class multiplication {
    public static void main(String[] args) {
        multi object = new multi();
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int multiplication = object.multi1(x, y);
            System.out.println(multiplication);
        }

    }
}
