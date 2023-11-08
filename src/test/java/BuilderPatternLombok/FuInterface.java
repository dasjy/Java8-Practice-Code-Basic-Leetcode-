package BuilderPatternLombok;

@FunctionalInterface
public interface FuInterface {
    void test();

    public static void test2()
    {
        System.out.println("Test");
    }
}
@FunctionalInterface
interface FuInterface2 extends FuInterface
{
    void test();
}
class TestFinterface implements FuInterface
{

    @Override
    public void test() {
        System.out.println("Test2");
    }
}
class test
{
    public static void main(String[] args)
    {
        TestFinterface t=new TestFinterface();
        t.test();
    }
}
