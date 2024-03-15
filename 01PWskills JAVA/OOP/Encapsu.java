class cheak
{
    private static int count ;
    static
    {
        count = 1000;
    }

    public static int getCount()
    {
        return count ;
    }
}
public class Encapsu
{
    public static void main(String[] args)
    {
        System.out.println(cheak.getCount());

    }

}
