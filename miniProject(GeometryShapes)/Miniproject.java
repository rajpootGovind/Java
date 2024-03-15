package pillers;
import java.util.Scanner;
abstract class Shape
{
    float area;
    abstract  public void acceptInput();
    abstract public void compute();
    public void disp()
    {
        System.out.println("The area is: "+area);
    }
}
class Square extends Shape
{
  private float length;
    Scanner scan = new Scanner(System.in);
    public void acceptInput()
    {
        System.out.print("enter the length of square: ");
        length = scan.nextFloat();
    }
    public void compute()
    {
        area = length*length;
    }
}
class Rectangle extends Shape
{
    private float length;
    private float breadth;
    Scanner scan = new Scanner(System.in);
    public void acceptInput()
    {
        System.out.println("enter the length of rectangle: ");
        length = scan.nextFloat();
        System.out.println("enter the breadth of rectangle: ");
        breadth = scan.nextFloat();
    }
    public void compute()
    {
        area = length*breadth;
    }
}
class Circle extends Shape {
    private float radius;
    Scanner scan = new Scanner(System.in);
    public void acceptInput()
    {
        System.out.print("enter the radius of circle: ");
        radius = scan.nextFloat();
    }
    public void compute()
    {
        area = (3.141f*radius*radius);
    }
}
class Geometry
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}


public class Miniproject
{
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Geometry G = new Geometry();
        G.permit(s);
        G.permit(r);
        G.permit(c);
    }
}
