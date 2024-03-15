import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

import java.util.Arrays;
public class Strg
{
    public static void main(String[] args)
    {
      /*  String str ="my name";
        String s2 = str.substring(3);
        System.out.println(s2);
        int indexNum = s2.indexOf('m');
        System.out.println(indexNum);
        char[]c= str.toCharArray();
        Arrays.sort(c);
        System.out.println(c);*/
       /* StringBuffer sb = new StringBuffer("PWSKILLS");
        sb.reverse();
        System.out.println(sb);
        String s1 = "Think Twice";
        String s2 =   s1.toLowerCase();
        System.out.println(s2);
        StringBuffer s3 = new StringBuffer(s2.substring(0,5));
        s3.reverse();
        StringBuffer s4 = new StringBuffer(s2.substring(5,11));
        s4.reverse();
        //System.out.println(" "+s4);
        StringBuffer res = new StringBuffer(s3.append(" "+s4));
        System.out.println(res);*/
     /*   Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);
        String s1 = "PW";
        String s2 = "SKILLS";
        String res = s1 +(" "+ s2);
        System.out.println(res);
       int a = res.length();
        System.out.println(a);*/
        String s = "umbrella";
       System.out.println (s.contains("e"));
       for(int i = 0 ; i<= s.length()-1 ; ++i)
       {
           if (s.charAt(i) == 'e')
           {
               System.out.println("true");
           }
          // else
         //  {
         //      System.out.println("false");
        //   }
       }
       Scanner scan = new Scanner(System.in);
       String a = scan.nextLine();
       char [] c = new char[5];
        System.out.println(a);
        int j= 0;
        for(int i=0 ; i<=a.length()-1 ; ++i)
        {
            if(a.charAt(i)!='a' || a.charAt(i)!='e')
            {
             c[i] = a.charAt(i);
                System.out.print(c[j++]);
            }
        }
        System.out.println(a);

    }
}