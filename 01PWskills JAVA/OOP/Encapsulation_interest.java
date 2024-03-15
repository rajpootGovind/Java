package pwskills;
class simpleInterest
{
    static float interest_rate;
    private int ammount ;
    int si;
    float time;
    static
    {
        interest_rate = 7;
    }
    public simpleInterest(int ammount, float time)
    {
        this.ammount = ammount;
       this. time = time ;
    }
    public int getAmmount()
    {
        return ammount;
    }


}
public class Encapsulation
{
  public static void main(String[] args)
  {
   simpleInterest si1 = new simpleInterest(500000,4.5f);
      float si = si1.getAmmount();
  }
}
