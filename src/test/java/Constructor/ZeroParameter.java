package Constructor;

class testConstructor
{
    public testConstructor()
    {
        this(20);
        System.out.println("Data Constructors.");
    }
    public testConstructor(int x)
    {
        System.out.println(x);
    }
}
public class ZeroParameter {
    public static void main(String[]arags)
    {
        testConstructor test=new testConstructor();

    }
}
