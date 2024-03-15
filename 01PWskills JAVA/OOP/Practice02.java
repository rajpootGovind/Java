class Dog
{
    private String breed ;
    private float age ;
    private int price ;
   public void setDog(String breed, float age , int price)
    {
      this. breed = breed;
      this. age= age;
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
public class Launch
{
    public static void main(String[] args)
    {
        Dog d = new Dog ();
        Dog d1 = new Dog();

        d1.setDog("bull",23, 67000);
        System.out.println( d1.getBreed());
        System.out.println( d1.getAge());
        System.out.println( d1.getPrice());

        d.setDog("pug", 4.5f, 6666);
        System.out.println( d.getBreed());
        System.out.println( d.getAge());
        System.out.println( d.getPrice());


    }
}
