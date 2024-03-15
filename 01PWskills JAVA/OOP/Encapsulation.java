class Cat
{
 private String breed;
 private float age;
 private int price;

public Cat()
{
    breed = "pussy";
    age = 2.5f ;
    price = 4000 ;
}
    public  Cat( String breed, float age, int price)
    {
        this. breed = breed;
        this. age = age ;
        this. price = price;
    }
 public String getBreed()
 {
     return breed;
 }
 public float getAge()
 {
     return age;
 }
 public int getPrice()
 {
     return price;
 }
}
public class Launch_02
{
    public static void main(String[] args)
    {
        Cat c = new Cat("bug",3.5f,6000);
        System.out.println(c.getBreed());
        System.out.println(c.getAge());
        System.out.println(c.getPrice());

       Cat c2 = new Cat();
        System.out.println(c2.getBreed());
        System.out.println(c2.getAge());
        System.out.println(c2.getPrice());

    }
}
