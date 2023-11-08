package Constructor;

class test
{
    String name="Jyoti";
}
class test2 extends test{
    String name="Das";
    public  void displayName()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class SuperKeyWord {

    public static void main(String [] args)
    {
        test2 t2=new test2();
        t2.displayName();
        // when ever parent class and child class variable same,
        //super keyword use to print parent class value.
    }
}
