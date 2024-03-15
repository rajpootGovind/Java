import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][]a = new int[3][];
        a[0]= new int[2];
        a[1]=new int [3];
        for (int i = 0; i <= 2 ; ++i)
        {
            System.out.println("enter the students");
            for(int j=0; j<=a[i].length-1 ; ++j)
            {
            System.out.println("enter the marks");
            a[i][j]= scan.nextInt();
            System.out.println(a[i][j]);
            }
        }
        System.out.println("1st length is "+a.length);
        System.out.println("2nd length is "+a[2].length);
    }
}
