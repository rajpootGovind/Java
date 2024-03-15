package pillers;
abstract class Plane
{
   abstract public void takeOff();

   abstract public void fly();

   abstract public void land();

}
class CargoPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("Cargopalne is taking-off on long size runway");
    }
    public void fly()
    {
        System.out.println("Cargoplane is flying at lower height");
    }
    public void land()
    {
        System.out.println("cargoplane landed on long sized runways");
    }
//    public void speed()
//    {                                            - Specialised method
//        System.out.println("cc speed is low");
//    }

}
class FighterPlane extends Plane
{
    public void takeOff()
    {
        System.out.println("fighterpalne can taking-off on small size runway");
    }
    public void fly()
    {
        System.out.println("Fighterplane is flying at high height");
    }
    public void land()
    {
        System.out.println("Fighterplane can landed on small runways");
    }

}
class PassangerPlane extends Plane {
    public void takeOff() {
        System.out.println("PassangerPlane is taking-off on medium size runway");
    }

    public void fly() {
        System.out.println("passanagerplane is flying at medium height");
    }

    public void land() {
        System.out.println("Passangerplane landed on medium sized runways");
    }

}
class Airport
{
    public void permit(Plane ref)
    {
        ref.takeOff();
        ref.fly();
        ref.land();
    }

}
public class Abstraction
{
    public static void main(String[] args)
    {
       CargoPlane cp = new CargoPlane();
       PassangerPlane pp = new PassangerPlane();
       FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.permit(cp);
        System.out.println();
        a.permit(pp);
        System.out.println();
        a.permit(fp);
    }
}
