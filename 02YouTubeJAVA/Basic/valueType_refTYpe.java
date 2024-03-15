import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
class Instance
{
    int r=23;
    float q;
    void cheak()
{
    Scanner scan = new Scanner(System.in);
   // r = 23;
    int z ;
    q = scan.nextFloat();
    float res = (r+q) ;
    System.out.println(r);
    System.out.println(q);
    System.out.println(res);
}

}

public class Revision
{
    public static void main(String[] args)
    {
//        char star = '/';
//        int num = (int)star ;
//        System.out.println(num);
//                                  //  : TYPE CASTING
//        int num1 = 32771;
//        short cas_num1 = (short)num1 ;
//        System.out.println(cas_num1);

        int a = 10 ;
        System.out.println(a);

        int b ;
         b = a ;               // ->  VALUE TYPE ASSIGNMENT
        System.out.println(b);
        b= 20 ;
        System.out.println(a);
        System.out.println(b);

        Instance s = new Instance();
      //  System.out.println(r);
        s.r = 24;
        s.cheak();

        System.out.println(s.r);

//       Instance dusra = s ;
//       dusra.r= 25 ;
//        dusra.cheak();




    }
}
