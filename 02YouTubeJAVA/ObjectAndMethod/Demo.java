class displ
{
    static int a ;
    static int b ;
    int x =30 ;
    int y = 40;
    static
    {
        System.out.println("static");
        System.out.println("ststic 2");
        a =10 ;
        b = 20 ;
    }
    static void show1()
    {
        System.out.println("ststic: "+a);
    }
    void show()
    {
        System.out.println(x+y);
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        displ mainShow = new displ();
        mainShow.show();

      //  displ.show1();
    }
}