package Constructor;

class superClass
{
    superClass()
    {

        System.out.println("abcd");
    }
    superClass(String data)
    {

        System.out.println("data");
    }
}
class superClass2 extends superClass
{

    superClass2()
    {
        super();
        System.out.println("efgh");
    }
}
public class SuperMethod1 {
    public static void main(String [] args)
    {
        superClass2 s2=new superClass2();


    }
}
