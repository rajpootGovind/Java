import java.util.Scanner;
class algebra{
    int a;
    int b ;
    algebra (int x , int y){
        System.out.println("the constructor has been called");
        a = x ;
        b = y ;
    }
int add(){
  return   a + b ;
    }
    int mul(){
        return a*b ;
    }
    int sub (){
        return a-b ;
    }
}
public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       int y = sc.nextInt();
       algebra obj = new algebra( 10,7);
        System.out.println("sum");
     int ans =  obj.add ();   // or System.out.println(obj.add());
        System.out.println(ans);
        System.out.println("mul");
        System.out.println(obj.mul());
        System.out.println("sub");
        System.out.println(obj.sub());

        algebra obj2 = new algebra (x , y);
        System.out.println("mul2 is ");
        System.out.println(obj2.mul());

    }
}
