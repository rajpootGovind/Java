class Plane
{
    void takeOff()
    {
        System.out.println("plane is takeOff");
    }
    void fly()
    {
        System.out.println("plane is flying");
    }
    void land()
    {
        System.out.println("plane has been landed");
        System.out.println();
    }
}
class Cargoplane extends Plane
{
  void fly()
  {
      System.out.println("Cargoplane is flying");
  }
  void carryCargo()
  {
      System.out.println("Cargoplane is carrying luggage");
  }
}
class Passangerplane extends Plane
{
   void fly()
   {
       System.out.println("Passangerplane is flying");
   }
   void carryPassanger()
   {
       System.out.println("carrying passanger");
   }
}
class Fighterplane extends Plane
{
 void fly()
 {
     System.out.println("Fighterplane is flying");
 }
 void carryWeapon()
 {
     System.out.println("carrying weapon");
 }
}
public class Again
{
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.fly();
        cp.carryCargo();
        cp.takeOff();
        cp.land();

        Fighterplane fp = new Fighterplane();
        fp.fly();
        fp.carryWeapon();
        fp.takeOff();
        fp.land();

        Passangerplane pp = new Passangerplane();
        pp.fly();
        pp.carryPassanger();
        pp.takeOff();
        pp.land();
    }
}
