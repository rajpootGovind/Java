package pwskills;
class Animal
{
    void eat()
    {
        System.out.println("animal eat everything");
    }
    void run()
    {
        System.out.println("anima can run");
    }
    void body()
    {
        System.out.println("animals have four legs");
    }
}
class Tiger extends Animal
{
    void eat()
    {
        System.out.println("tiger eat meat");
    }
}
class Deer extends Animal
{
 void eat()
 {
     System.out.println("deer eat grass");
 }
 void type()
 {
     System.out.println("deer type is multiple");
 }
}
 class Earth
{
    public void poly(Animal ref)
    {
        ref.eat();
        ref.run();
        ref.body();
      //  ref.type();
        System.out.println("----------------------------------");
    }
}

public class Poly01
{
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        Deer d = new Deer();
        Earth e = new Earth();
        e.poly(t);
        e.poly(d);
    }
}
