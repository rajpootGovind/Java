package pwskills;
class teacher
{
    void teaches()

    {
        System.out.println("teaches to student");
    }
    public teacher (int total)
    {
        System.out.println("no. of teacher is :"+total);
    }
}

class student1 {
    int x;
    int y;
    int z;
    String name;

    public student1(String name) {
        this.name = name;
        System.out.println("this is " + name);
    }

    public student1(int a, int b) {
        x = a;
        y = b;
        System.out.println(a + " " + b);
    }

    public student1() {
        this(20, 40);
        System.out.println("default constructor");
    }
}
    class student2 extends teacher
    {
       public student2()
       {
           super(5);
       }
           void teaches()
           {
               System.out.println("overridden method");
           }
    }

public class Inheritance
{
    public static void main(String[] args) {
        student1 s = new student1("govind");
        s.name = "govind rajpoot";
        System.out.println(s.name);
        student1 s1 = new student1 ();

        student2 s2 = new student2 ();
        s2.teaches(); // only overridden method will call.

    }
}